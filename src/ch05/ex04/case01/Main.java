package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		//Card.kind; 객체가존재하지 않아서 못 쓴다.
		//Card.number;
		
		Card card1 = new Card();
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
		
		System.out.printf("%s %d %d %d\n",card1.kind, card1.number, card1.width, card1.height);//노란색 줄은 에러는 아니지만 위험하다는 뜻이다.
		System.out.printf("%s %d %d %d\n",card1.kind, card1.number, Card.width, Card.height); //class. static variable로쓴다.
		System.out.printf("%s %d %d %d\n",card2.kind, card2.number, Card.width, Card.height);
	}//lock queue - 화장실을 공유하는 알고리즘은 줄을 서고, 문을 잠근다.
}//static variable 은 class. 하고 사용하면 된다.(쓰지마라) (대중교통, 도서관의 책 을 공유한다.) 공유하면 오염되기 때문이다. 하지만 공유해야 한다. 그러기때문에 알고리즘을 잘 짜야한다.
//static variable 바이트 코드가 로딩될 때 생성된다. 읽기쓰기가 더 자유롭다.