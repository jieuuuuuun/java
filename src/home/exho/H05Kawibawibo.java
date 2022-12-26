package home.exho;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int playerChoice = 0;
		int appChoice = 0;
		String result = "";
		String choice = "";
		
		System.out.print("1.가위 2.바위 3.보\n>");
		playerChoice = sc.nextInt();
		appChoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerChoice && playerChoice <= 3) {
			result = switch(playerChoice - appChoice) {
			case -2, 1 -> "You win";
			case -1, 2 -> "You lose";
			default -> "Fair";
			};
			
			choice = switch(playerChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("You: " + choice);
			
			choice = switch(appChoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("Me: " + choice);
			
		}else result = "[ERRIR] 1, 2, 3중에서 입력하세요.";
		
		System.out.println("\n" + result);
	}
}
