package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		
		Tree tree = new Platanus();//promotion이 일어난것이다.
		platanus = (Platanus)tree;
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}
//관점이다르다.