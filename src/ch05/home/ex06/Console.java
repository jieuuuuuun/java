package ch05.home.ex06;

import java.util.Scanner;

public class Console {
	private static Scanner sc;
	private String msg;
	
	static {
		sc = new Scanner(System.in);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	public static String inStr(String msg) {
		boolean isGood = false;
		do {
			Console.inMsg(msg);
			isGood = msg.matches("[a-zA-Z가-힣]*");
			if(isGood) 
			Console.err("문자가 아닙니다.");
		}while(!isGood);
		return sc.nextLine().trim();
	}
	
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
	
	public static void err(String msg) {
		System.out.println("ERROR]" + msg);
	}
}//입력하다 출력하다만 관심이 있어서 static을 사용하였다.
