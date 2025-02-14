package Part_1;

public class OutOfNumberLengthException extends Exception {

	public OutOfNumberLengthException() {
		super("Количество отбрасываемых символов больше длины числа");
	}

	public OutOfNumberLengthException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public OutOfNumberLengthException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public OutOfNumberLengthException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public OutOfNumberLengthException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
