package ch06.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog(1);
		
		dog.shout();
		System.out.println(dog.getAge());//접두사에 따라 호출할 수 있다.
	}
}
//오버라이딩 된 것은 자식이 호출된다.
//상속의 장점은 하나의 객체가 n개의 타입을 가질 수 있다.