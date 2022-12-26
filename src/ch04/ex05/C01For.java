package ch04.ex05;

public class C01For {
	public static void main(String[]args) {
		for(int i = 0; i < 10; i++) {
			System.out.print("*");
		}
		for(int i = 0; i < 10; i++)
			System.out.print(i + " ");//for하나일 경우 블럭생략가능, 가독성이 더 좋다 더 많이 쓰인다.
		System.out.println();
		
		//과제: 초기값 i = 1상황에서, 0이상 9 이하를 출력하라.
		for(int i = 1; i <= 10; i++)	
			System.out.print(i - 1  + " ");
	}
}
