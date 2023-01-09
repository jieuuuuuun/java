package ch07.ex05.case08;
//오리는 새이다. is a관계
public class Duck implements Bird{
	@Override
	public void fly() {
		System.out.println("오리 날다.");
	}
}
