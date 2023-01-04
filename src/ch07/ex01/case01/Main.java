package ch07.ex01.case01;

public class Main {
	public static void main(String[] args) {
		C c = new C();//힙에존재한다.
		B b = c;//c타입을 b타입으로 프로모션시켜서 할당되었다. promotion은 자동으로 일어난다.
		A a = c;//b,a 는 스텍에존재한다.
		
		c = (C)a;//강제 변환은 casting이다 큰수에서 작은수는 자동으로 변환이 안되기 떄문에 강제변환한다.
		c = (C)b;
		
		b = (B)a;
		
		//String s = (String)c; 내가 가지고 있는 타입중에서만 변환한다. 그러니 String 으로는 변환은 컴파일에러다.
	}
}
//다형성(polymorphism)