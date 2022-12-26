package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		String a = "";
		String b = "";
		boolean isGood = false;
		String op = "";
		
		do{
			System.out.print("a: ");
			a = sc.nextLine();
			isGood = a.matches("[0-9]*");
			if(!isGood)System.out.println("0또는 자연수를 입력하세요.");
		} while(!isGood);
		
		do{
			System.out.print("op: ");
			op = sc.nextLine();
			isGood = op.matches("[+,-,*,/]");
			if(!isGood)System.out.println("연산자를 입력하세요.");
		} while(!isGood);
		
			
		do{
			System.out.print("b: ");
			b = sc.nextLine();
			isGood = b.matches("[0-9]*");
			if(!isGood)System.out.println("0또는 자연수를 입력하세요.");
		} while(!isGood);
		
		int a2 = Integer.parseInt(a);
		int b2 = Integer.parseInt(b);
		
		System.out.printf("%d %s %d = %d", a2,op,b2,a2+b2);
		
	}
	
}

/*
과제: 계산기를 만들어라. 
입력값 a,b는 0 또는 자연수이다.
연산자 op는  +, -, *, /이다.
/ 는 몫만을 구한다.
 
continue(y/n)? 에서 y 또는 y를 입력하면 계산 작업을 재수행한다.
y또는 Y외의 입력하면 앱을 종료한다. 
--
int i = Integer.parseInt(sumStr);

a: 1
op: +
b: 2
1 + 2 = 3
continue(y/n)? y
a: 2
op: *
b: 2
2 * 2 = 4
continue(y/n)? n
end.
*/
