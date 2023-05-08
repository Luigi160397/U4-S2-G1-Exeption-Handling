package esercizio3.exception;

public class BancaException extends Exception {
	public BancaException(String message) {
		super(message);
		toString(message);
	}

	public String toString(String str) {
		return str;
	}
}
