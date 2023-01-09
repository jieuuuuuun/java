package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		
		calculator = (a, b) -> a + b;//실전에서 쓰는 람다식
		
		System.out.println(calculator.calc(1,2));
	}
}
//리턴명령문만 있을때는 블럭생략 가능 리턴외의 다른것과 같이 쓸때에는 블럭생략 안됨.