package ch05.ex05.case02;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		double result = calculator.add(1,2);//int result가 double로 프로모션 되어 리턴한다.
		result = calculator.add(1.0, 2.0);
		
		System.out.println(result);
	}
}
