package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say");
		human.say();
		//human.walk();//static method는 상속이 안되기 때문에 못쓴다.
		Human.walk();
		human.sleep();
		
		human = new Student();
		human.say();
		human.sleep();
	}
}
