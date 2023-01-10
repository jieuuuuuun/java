package ch08.ex04.case01;

public class C05Hierarchy {
	public static void main(String[] args) {
		try {
			int i = 3 / 0;
		} catch(ArithmeticException e) {
			System.err.println("ArithmeticException.");
		} catch(Exception e) {
			System.err.println("Exception.");//error메세지 출력장치
		} 
	}
}
//자식에서 부모순으로 나열한다. 위에서부터 차례대로 비교하기때문이다.