package ch07.ex01.case07;

public class Human {
	//과제: 아래 세 method call 을 한 method call 로 refactoring 하라.
	//public void eat(Ramen ramen) {}
	//public void eat(Kimchi kimchi) {}
	//public void eat(Apple apple) {}//먹고있다는 인지를 한다면 주석의 내용처럼 써야한다.
	
	public void eat(Food food) {
		System.out.println(food + "를 먹다.");
	}
}
