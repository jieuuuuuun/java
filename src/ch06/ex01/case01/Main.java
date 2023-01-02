package ch06.ex01.case01;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
	}
}
//중복제거하기 위해 추상명사(동물,꽃 등) 사용한다.