package home.ch05.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Player.teamName = "호랑이";
		
		Player player1 = new Player();
		Player player2 = new Player();
		
		player1.playerName = "최한석";
		player2.playerName = "한아름";
		
		System.out.printf("%s %s\n",player1.playerName,Player.teamName);
		System.out.printf("%s %s", player2.playerName, Player.teamName);
		
	}
}
