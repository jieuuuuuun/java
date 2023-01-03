package home.ch06.ex02.case01.sub;

import home.ch06.ex02.case01.A;
//extends 로 상속받있기 때문에 new A안한다.
public class C extends A {
	public void text() {
		int x = 0;
		
		//x = this.a; private 특징이다 자식조차도 못쓴다.
		//x = this.b; 다른 패키지에 있기때문에 못쓴다.
		x = this.c;//자식한테는 보여주고 싶다면 protected를 쓰면 된다.
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}
}
