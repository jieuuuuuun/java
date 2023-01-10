package ch08.ex04.case01;

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int result = arr[10];
		System.out.println("끝.");
	}
}
//입센션이 생겨도 극복하기 위해 try를 사용한다.