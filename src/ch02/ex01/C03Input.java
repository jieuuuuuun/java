package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//컴파일러
		
		/*
		System.out.print("문자열을 입력하세요.\n> ");//void면 return이없다.		
		String str = sc.nextLine();
		System.out.println("입력했습니다.");

		// 과제: '<입력값>을 입력했습니다.'를 출력하라.
		String str = sc.nextLine(); //soft coding-확장성을 만드는것이다.
		System.out.printf("%s을 입력했습니다.\n", str);*/
		
		
		System.out.print("숫자를 입력하세요.\n> ");
		int i = sc.nextInt();
		System.out.println(i + "을 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n>");
		i = sc.nextInt(); sc.nextLine();
		System.out.println(i + "을 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n>");
		String str = sc.nextLine();
		System.out.println(str + "을 입력했습니다.");
	
		
		/*System.out.print("문자를 입력하세요.\n>");
		char c = sc.nextLine().charAt(0);
		System.out.println(c+ "를 입력했습니다.");*/
	}
}