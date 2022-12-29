package ch05.ex05.case01;

public class Calculator {
	public int add(int a, int b) {
		return a + b;
	}
	
	/*
	public int add(int x, int y) {
		return x + y;
	}
	*/
	
	public int add(int a, int b, int c) {
		return a + b + c;
	}//위의 add int int와 다르다. 이것이 오버로딩이다.
}
//메서드 네임은 중복되면 안된다.