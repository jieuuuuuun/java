package ch08.ex03.case01;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("불편한편의점", 20000, LocalDate.of(2022,5, 7));
		Book book2 = new Book("불편한편의점", 20000, LocalDate.of(2022, 5,7));
		
		System.out.println(book);
		
		System.out.println(book.hashCode());
		System.out.println(book == book2);
		System.out.println(book.equals(book2));
		
		System.out.printf("%s %d %s", book.title(), book.price(), book.printedDate());
	}
}
//사용하기 편리하다. 단, 필드를 수정하지 않았다는 전제가 있어야한다.