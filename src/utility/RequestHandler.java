package utility;

public interface HttpHandler {
	void requestFailed(String message);

	void requestInterrupted(String message);

	void requestSuccess(String response) throws InterruptedException;
}
