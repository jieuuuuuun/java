package ch07.ex07.case01;

@FunctionalInterface//람다선언
public interface Human {
	void say();
	//void tell(); FunctinalUnterface에서는 메소드 하나만 쓸 수 있다.
}
//인터페이스니까 추상메소드 넣어준다.