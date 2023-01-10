package ch08.ex04.case01;

public class C01NoTry {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int result = arr[10];//일부러 에러발생
		System.out.println("끝.");
	}
}
//런타임 입센션이 생겨도 극복하기 위해 try를 사용한다.
//버그를 최소화해서 만들어야한다.
//인기와 버그의 갯수는 비례한다. 