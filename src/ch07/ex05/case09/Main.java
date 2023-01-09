package ch07.ex05.case09;

public class Main {
	public static void main(String[] args) {
		C c = new C();
		String msg = "";
		if(c instanceof C) msg += "C ";//오른쪽은 왼쪽이랑 가족일 가능성있는 클래스만 쓴다.
		if(c instanceof B) msg += "B ";
		if(c instanceof A) msg += "A ";
		if(c instanceof Object) msg += "Object";
		System.out.println(msg);
		
		B b = new B();
		msg = "";
		if(b instanceof C) msg += "C ";
		if(b instanceof B) msg += "B ";
		if(b instanceof A) msg += "A ";
		if(b instanceof Object) msg += "Object";
		System.out.println(msg);
		
		//if(b instanceof F)
		//if(c instanceof F)
		
		F f = new F();
		msg = "";
		//if(f instanceof C)
		if(f instanceof A) msg += "A";//A는 interface이기 때문이다. 보통은 instanceof옆에 인스턴스를 쓰게 된다.
		System.out.println(msg);
	}
}
//instanceof는 옆에 가질 수 있는 가능성이 있는 클래스를 넣는다.