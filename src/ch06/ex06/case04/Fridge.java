package ch06.ex06.case04;

public class Fridge	implements Appliance {
	@Override
	public void on() {}
	
	@Override
	public void off() {}
}
//implements 구현하다.
//인터페이스를 쓰는 경우 부모를 2개이상 가질 수 있다.
//일반class 롤사용하려면 추상메소드가 다 없어야한다.