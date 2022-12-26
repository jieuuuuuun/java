package ch04.ex05;

public class C03ByTwo {
	public static void main(String[]args) {
		int sum = 0;
		
		for(int i = 0; i <= 10; i += 2) {
			sum += i;
			System.out.printf("+%d: %d\n",i, sum);
		}
	}
}
//버그 잡는 것을 디버깅이라고 한다. 디버그 도구 이용해서 눈으로 확인하면서 개발한다.