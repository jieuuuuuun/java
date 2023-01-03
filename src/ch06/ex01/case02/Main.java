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
//객체상에서는 run을 각각가지고있다 소스코드상에서 중복코드를 제거한 것 뿐이다.