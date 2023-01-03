package ch06.ex03.case03;

public class Main {
	public static void main(String[] args) {
		Duck duck = new Duck();
		Hen hen = new Hen();
		
		System.out.printf("%s\n%s",duck, hen.toString());//duck.toString 알고리즘상으로 생략됨
	}
}
//duck object를 parameter받고, hen은 string으로 parameter받는다.