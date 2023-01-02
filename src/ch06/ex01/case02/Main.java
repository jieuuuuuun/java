package ch06.ex01.case02;

public class Main {
	public static void main(String[] args) {
		Leopard leopard = new Leopard();
		Lion lion = new Lion();
		
		leopard.run();
		lion.run();
		//결론은 상속 쓰지마시오. 유지보수 괴롭다. 
	}
}
