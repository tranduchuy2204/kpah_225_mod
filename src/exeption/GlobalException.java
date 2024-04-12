package exeption;

/*
 * Class xử lý ngoại lệ tổng
 */
public class GlobalException extends RuntimeException {

	public GlobalException() {

	}

	public GlobalException(String message) {
		super(message);
	}

}
