package home.ch04;

import java.util.Scanner;

public class EX04C01Dowhile {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: ");
			a = sc.nextInt();
			
			System.out.print("b: ");
			b = sc.nextInt();
			
			System.out.printf("%d + %d = %d\n\n", a,b,result = a + b);
		} while(result != 0);
	}
}
