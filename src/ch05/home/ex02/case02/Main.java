package ch05.home.ex02.case02;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Message msg1 = new Message();
		String msg = null;
		String userName = null;
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		
		do {
			System.out.print("메세지: ");
			msg = sc.nextLine();
			isGood =msg.matches("[a-zA-Z가-힣]+");
			if(!isGood) System.out.println("[ERROR] 메시지를 적으시오.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("작성자명: ");
			userName = sc.nextLine();
			isGood =userName.matches("[a-zA-Z가-힣]+");
			if(!isGood) System.out.println("[ERROR] 이름를 적으시오.");
		} while(!isGood);
		
		msg1.setMsg(msg);
		msg1.setUserName(userName);
		
		System.out.printf("\n%s from %s",msg1.getMsg(),msg1.getUserName());
	}
}
/*
과제: 종이에 메세지와 작성자명을 기록하라.
--

메세지: hello
작성자명: terry

hello from terry.
*/