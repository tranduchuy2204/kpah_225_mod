package utility;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;

public class HttpUtils {

	public static String getResponse(String url) {
		HttpConnection c = null;
		InputStream is = null;
		ByteArrayOutputStream baos = null;
		StringBuffer b = new StringBuffer();
		try {
			c = (HttpConnection) Connector.open(url);
			c.setRequestMethod(HttpConnection.GET);
			c.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
			c.setRequestProperty("User-Agent", "Profile/MIDP-1.0 Configuration/CLDC-1.0");
			is = c.openDataInputStream();
			baos = new ByteArrayOutputStream();
			int ch;
			while ((ch = is.read()) != -1) {
				baos.write(ch);
			}
			return new String(baos.toByteArray(), "UTF-8");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (c != null) {
				try {
					c.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (baos != null) {
				try {
					baos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return null;
	}
}
