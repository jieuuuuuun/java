package ch07.ex01.case07;

public class Main {
	public static void main(String[] args) {
		Human human = new Human();
		
		human.eat(new Ramen());
		human.eat(new Kimchi());
		human.eat(new Apple());
	}
}
//특히 멤버변수 타입은 인터페이스로 둬야겠다. 라는것을 깨닿는다.