package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() {}//알고리즘 구현하려면 default메소드를 사용한다.
}
