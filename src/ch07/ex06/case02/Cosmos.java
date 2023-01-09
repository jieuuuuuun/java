package ch07.ex06.case02;

public class Cosmos {
	public static Animal getAnimal(String animalName) {
		return switch(animalName) {
		case "호랑이" -> new Tiger();
		case "매" -> new Falcon();
		default ->null;
		};
		
	}
}
//객체를 만드는 새로운 방법이다.
//떠넘기는 것이다.
//cosmos한테 동물을 달라고 요청한다.
//펙토리 메소드