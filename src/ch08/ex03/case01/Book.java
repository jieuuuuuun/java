package ch08.ex03.case01;

import java.time.LocalDate;
import java.util.Objects;

public record Book(String title, int price, LocalDate printedDate) {
	public Book{
		Objects.requireNonNull(title);
		Objects.requireNonNull(printedDate);
	}
}
//필드3개가 준비되어있어야 레코드를 만들 수 있다.
//상속받는 기본 메소드 