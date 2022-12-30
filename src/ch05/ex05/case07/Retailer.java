package ch05.ex05.case07;

public class Retailer {
	//(Apple apple)은Farmer로 부터 리턴 받은 사과
	public Apple sell(Apple apple) {
		apple.setPrice(apple.getPrice() * 2);
		return apple;
	}
}
