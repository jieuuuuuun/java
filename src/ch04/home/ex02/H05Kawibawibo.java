package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int youChoise = 0;
		int meChoise = 0;
		String msg = "";
		String result = "";
		
		System.out.print("1.가위, 2.바위, 3.보\n>");
		youChoise = sc.nextInt();
		
		switch(youChoise) {
		case 1 -> msg = "가위";
		case 2 -> msg = "바위";
		case 3 -> msg = "보";
		}
		
		System.out.printf("You: %s\n", msg);
		
		meChoise = (int)(Math.random() * 3) + 1;
		System.out.printf("Me: %s\n", meChoise);
		
		if(youChoise == meChoise) result = "fair";
		else if((youChoise) < meChoise || (youChoise) > meChoise) result = "You lose.";
		else result = "You win.";
		System.out.print(result);
	}
		
		
}
/*
과제: 앱과 가위바위보를 하라. 게임 결과를 출력하라. 결과는
You win.
You lose.
fair.
중 하나이다.
--
1. 가위, 2.바위, 3.보
>1
You : 가위
Me: 보 

You win.
*/