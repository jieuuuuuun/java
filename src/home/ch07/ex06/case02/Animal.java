package home.ch07.ex06.case02;

public interface Animal {
	default void eat() {
		System.out.println("먹다");
	}
	
	public void move();
}
