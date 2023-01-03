package ch06.ex02.case01;

public class A {
	private int a;
	int b;//default패키지내 객체들끼리만 보인다.
	protected int c;//나랑 다른 패키지내에서는 안보인다. 다른패키지에 있어도 자식이면 보인다.
	public int d;
	
	private void m1() {}
	void m2(){}
	protected void m3() {}//패키지가 같아서 b에서도 접근가능하다
	public void m4() {}
	/*class B {}//클래스안에 클래스 안드로이드 개발자들이 자주쓰는 타입이다. 유지보수가 힘들기 때문에 나쁜코드이다.*/
}
//private이 scope이 가장 좁다. public이 scope이 가장 넓다.
