package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus();//tree가 부모이기 때문에 자동변환(promotion)이 일어난것이다.
		platanus = (Platanus)tree;
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}
//관점이다르다.