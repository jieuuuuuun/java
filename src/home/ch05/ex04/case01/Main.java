package home.ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d %d\n", Card.width,Card.height);
		
		Card.width = 15;
		Card.height = 10;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n",card1.kind,card1.number,card1.width,card1.height);
		System.out.printf("%s %d %d %d\n",card1.kind,card1.number,Card.width,Card.height);
		System.out.printf("%s %d %d %d",card2.kind,card2.number,Card.width,Card.height);
	}
}
