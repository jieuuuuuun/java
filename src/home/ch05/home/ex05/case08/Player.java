package home.ch05.home.ex05.case08;

public class Player {
	private String playerName;
	
	public Ball pass(Ball ball) {
		return ball;
	}
	
	public Ball kick(Ball ball) {
		return ball;
	}
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
}
/*
최한석, 한아름, 양승일이 축구를 한다.
한석이가 아름이한테 공을 패스한다.
아름이는 승일이한테 공을 패스한다.
승일이는 공을 찬다.
*/