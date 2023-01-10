package ch07.ex07.case05;

@FunctionalInterface
public interface Janitor<T> {
	void clean(T t);
}
//제네릭타입으로 선언하였다.