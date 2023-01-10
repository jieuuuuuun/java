package ch08.ex04.case02;
//숫자가 아니다 라는 상태
public class NumberException extends RuntimeException {
	public NumberException(String msg) {
		super(msg);
	}
}
