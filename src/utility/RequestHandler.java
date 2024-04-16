package utility;

public interface RequestHandler {
	void requestFailed(String message);

	void requestInterrupted(String message);

	void requestSuccess(String response) throws InterruptedException;
}
