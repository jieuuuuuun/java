package ch07.ex07.case04;

public class Smith {
	public Gun makeGun() {
		return () -> System.out.println("드르륵.");
	}
}
//gun을 리턴타입으로 쓰고 있다