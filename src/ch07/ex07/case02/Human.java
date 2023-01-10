package ch07.ex07.case02;

@FunctionalInterface
public interface Human {
	void say();
	
	static void walk() {
		System.out.println("Human walk.");
	}
	
	default void sleep() {
		System.out.println("Human sleep.");
	}
}
//추상메소드가 아닌 stataic, default 갯수제한 없이 코딩할 수 있다.