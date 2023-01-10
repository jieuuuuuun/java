package home.ch08.ex03.case01;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Book book = new Book("어린왕자", 10000, LocalDate.of(2020,1,5));
		Book book2 = new Book("어린왕자", 10000, LocalDate.of(2020,1,5));
		
		System.out.println(book);
		
		System.out.println(book.hashCode());
		System.out.println(book == book2);
		System.out.println(book.equals(book2));
		
		System.out.printf("%s %d %s",book.title(), book.price(), book.printedDate());
	}
}
