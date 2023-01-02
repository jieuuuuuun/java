package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A{
	public void test() {
		int x = 0;
		
		//x = this.a;private 특징 자식조차도 못쓴다.
		//x = this.b;다른 패키지이기 때문에 못쓴다.
		x = this.c;//자식한테는 보여주고 싶다면 protected를 쓴다.
		x = this.d;
		
		//this.m1();
		//this.m2();
		this.m3();
		this.m4();
	}

}
//new A안하는 이유는 이미 상속받았기 떄문이다.