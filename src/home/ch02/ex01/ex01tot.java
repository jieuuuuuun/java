package home.ch02.ex01;

import java.util.Scanner;

public class ex01tot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a: ");
		int a = sc.nextInt();
		System.out.print("b: ");
		int b = sc.nextInt();
		System.out.printf("=> a: %d b: %d \n", a, b);
		
		System.out.println("=>a, b 값을 교환합니다.");
		int tmp = 0;
		tmp = a;
		a = b;
		b = tmp;
		System.out.printf("=> a: %d b: %d 값을 교환했습니다.",a,b);
	}
}
/*
과제:  두 변수의 데이터를 교환하다.
a: 1, b:2
a: 2, b:1
*/