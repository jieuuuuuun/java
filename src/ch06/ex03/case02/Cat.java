package ch06.ex03.case02;

public class Cat extends Animal {
	@Override //annotation 
	public void shout() {
		System.out.println("야옹야옹");
	}
}
//override 로 method body를 바꿔치기한다.