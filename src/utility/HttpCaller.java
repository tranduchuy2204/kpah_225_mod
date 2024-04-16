package utility;

import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

import exeption.GlobalException;

public class HttpCaller {
	private String url;
	private HttpHandler handler;
	private String requestData;
	private String method = HttpConnection.GET;

	public HttpCaller(String url, String requestData, HttpHandler handler) {
		this.url = url;
		this.handler = handler;
		this.requestData = requestData;
	}

	public void setMethod(String method) {
		if (!method.equals(HttpConnection.POST) && !method.equals(HttpConnection.POST)) {
			throw new GlobalException("Method must be GET or POST");
		}
		this.method = method;
	}

	public void run() {
		HttpConnection httpConnection = null;
		DataOutputStream dataOutputStream = null;
		DataInputStream dataInputStream = null;

		try {
			// get the HTTPConnection
			httpConnection = getHTTPConnection(url);

			// open output stream and write data on it
			dataOutputStream = httpConnection.openDataOutputStream();

			dataOutputStream.write(requestData.getBytes());

			// check HTTPConnection status
			if (httpConnection.getResponseCode() == HttpConnection.HTTP_OK) {
				// get DataInputStream from HTTPConnection
				dataInputStream = httpConnection.openDataInputStream();

				// read response from the DataInputStream Object
				String response = readResponse(dataInputStream);

				// response received successfully
				handler.requestSuccess(response);
			} else {
				// something goes wrong with HTTPConnection
				handler.requestFailed("HTTP Error: " + httpConnection.getResponseCode());
			}
		} catch (Exception excetion) {
			// something goes wrong
			handler.requestFailed(excetion.getMessage());
		} finally {
			// close all streams and connections
			close(dataOutputStream);
			close(dataInputStream);
			close(httpConnection);
		}
	}

	private HttpConnection getHTTPConnection(String url) throws IOException {
		// create HTTP connection
		HttpConnection connection = (HttpConnection) Connector.open(url, Connector.READ_WRITE);

		// set request properties
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connection.setRequestProperty("User-Agent", "Profile/MIDP-1.0 Configuration/CLDC-1.0");
		int length = requestData.toString().getBytes().length;
		connection.setRequestProperty("Content-length", String.valueOf(length));
		connection.setRequestMethod(this.method);

		// return create connection
		return connection;
	}

	private String readResponse(DataInputStream dataInputStream) throws IOException {
		// prepare response buffer
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		int ch;

		// start reading data
		while ((ch = dataInputStream.read()) != -1) {
			byteArrayOutputStream.write(ch);
		}

		String response = new String(byteArrayOutputStream.toByteArray());

		// close ByteArrayOutputStream
		close(byteArrayOutputStream);

		return response;
	}

	private void close(Object obj) {
		if (obj != null) {
			try {
				if (obj instanceof HttpConnection) {
					((HttpConnection) obj).close();
				} else if (obj instanceof DataInputStream) {
					((DataInputStream) obj).close();
				} else if (obj instanceof DataOutputStream) {
					((DataOutputStream) obj).close();
				} else if (obj instanceof ByteArrayOutputStream) {
					((ByteArrayOutputStream) obj).close();
				}
			} catch (IOException exception) {
			}
			obj = null;
		}
	}
}
