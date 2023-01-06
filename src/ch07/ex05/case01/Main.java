package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>();
		basket.set(new Apple());
		System.out.println(basket.get());
		
		//basket.set(new Grape());타입 불일치 컴파일 에러
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.println(basket2.get());
	}
}
//New 해서 타입결정은 객체생성할때 정한다. 