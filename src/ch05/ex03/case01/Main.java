package ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv();//new 연산자이다. 객체를 생성하다는 기능이 있다.
		System.out.println(myTv);
		
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChannel(7);
		
		System.out.printf("%s, %b, %d\n",
				myTv.getColor(), myTv.isPower(), myTv.getChannel());
	}
}
