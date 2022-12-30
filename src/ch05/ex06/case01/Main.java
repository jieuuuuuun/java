package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java.");//누가 말했는지 관심없다.
		//Man.tell("");인스턴스가 있어야한다.
		
		Man man = new Man();
		man.tell("I LOVE JAVA");
		man.say("Hello.");//위험한 코드이다.
	}
}
