package ch07.ex05.case02;

public class AutoBoxing {
	public static void main(String[] args) {
		System.out.println(add(1, 2));
	}
	
	private static int add(Integer a, Integer b) {
		return a + b;
	}
}
//Api와 결합해서 많이 사용된다.