package ch05.ex05.case05;

public class Basket {
	//과제: 사과 바구니를 디자인하라.
	private Apple apple;//A has a B(A(basket)가 B(apple)를소유한다.)

	public Apple getApple() {
		return apple;//apple를 return 받아야 하므로 class를 Apple로 선언했다.
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}
}
