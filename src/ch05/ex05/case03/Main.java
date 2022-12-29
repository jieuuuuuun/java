package ch05.ex05.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();//지역변수 계산기 만들어진다.객체생성한다,멤버없다
		Paper paper = new Paper();
		
		int result = calculator.add(1, 2);//오퍼레이터 작업을 cpu에서 한다. 리턴하면 로컬베리어블이 사라진다.
		System.out.println(result);
		
		paper.setA(1);
		paper.setB(2);
		paper = calculator.add(paper);//calculator가 add한paper를 paper에 return한다.
		System.out.println(paper.getResult());
	}
}
