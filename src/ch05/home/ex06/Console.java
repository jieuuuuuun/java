package ch05.home.ex06;

import java.util.Scanner;

import ch06.home.ex03.case03.User;

public class Console {
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		boolean isGood = false;
		String input = "";
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣]*");
			if(!isGood) Console.err("문자가 아닙니다.");
		}while(!isGood);
		
		return input;
	}
	
	public static int inNum(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("^[1-9][0-9]*");//두자리수 예외처리하는 방법이다.
			if(!isGood) Console.err("자연수가 아닙니다.");
		} while(!isGood);
		
		return Integer.parseInt(input);
	} 
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}


}//입력하다 출력하다만 관심이 있어서 static을 사용하였다.
