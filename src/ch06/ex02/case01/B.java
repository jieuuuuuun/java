package ch06.ex02.case01;

public class B {
	public void test() {
		A a = new A();
		
		int x = 0;
		//x = a.a;
		x = a.b;
		x = a.c;
		x = a.d;
		
		//a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
//b 객체에서 a객체를 만든이유는 내가 필요로 하는 멤버 변수, 데이터, 메소드가 있기때문이다.