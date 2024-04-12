package exeption;
/*
 * Xử lý ngoại lệ quá thời gian...
 */
public class TimeOutException extends RuntimeException {

	public TimeOutException() {
	}

	public TimeOutException(String s) {
		super(s);
	}
}
