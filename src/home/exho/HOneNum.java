package home.exho;

import java.util.Scanner;

public class HOneNum {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String input = "";
		boolean isGood = false;
		
		do {
			System.out.print("> ");
			isGood = sc.nextLine().matches("[1-9]");
			if(!isGood) System.out.println("한자리 자연수를 입력하세요");
		}while(!isGood);
		
		System.out.println("끝.");
	}
}
