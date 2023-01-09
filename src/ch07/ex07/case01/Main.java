package ch07.ex07.case01;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("world");
		human.say();//주어 + 서술어 객체지향스럽게 변수명을 지어서 코딩한다.
	}
}
