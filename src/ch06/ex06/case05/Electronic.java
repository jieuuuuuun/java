package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic {
	public  static final int VOLTAGE = 200;//public  static final 자동으로 붙는다.
	static final String MAKER_NAME = "LG";
	final int  WEIGHT = 10;
	LocalDate PRODUCED_DATE = LocalDate.now();
	
	public abstract void displayMsg();//public abstract void 자동으로 붙는다.
	abstract int getTemperature();
	String getModelName();
}
//인터페이스에서는 static variable 만 가능하다. 인스턴스를 만들 수 없기때문이다.
//final이기때문에 값이 계속 고정되어있다.
//public을 쓰지 않아도 자동 추가된다.
//인터페이스는 생성자도 없다.
//인터페이스 메소드는 public abstract 생략해도된다.
//인터페이스에서는 변수명에 변수값 초기값을 넣어준다.