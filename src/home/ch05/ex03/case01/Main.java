package home.ch05.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Tv myTv = new Tv();
		
		myTv.setColor("red");
		myTv.setPower(true);
		myTv.setChannel(7);
		
		System.out.printf("%s, %b, %d",
				myTv.getColor(),myTv.isPower(),myTv.getChannel());
	}
}
