package ch06.ex06.case04;

public interface Appliance {
	void on();
	void off();
}
//인터페이스는 바디를 안쓴다.
//인터페이스는 public이 기본이다.
//추상메소드 - 실행하지 않는 메소드
//추상메소드만으로 구성할거면 interface로 만드는게 좋다.
//interface는 단독으로 쓰지 않는다.