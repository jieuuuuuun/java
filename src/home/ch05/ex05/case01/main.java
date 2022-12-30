package home.ch05.ex05.case01;

public class main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		result = calculator.add(1,2,3);
		
		System.out.println(result);
	}
}
