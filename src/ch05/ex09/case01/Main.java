package ch05.ex09.case01;

public class Main {
	public static void main(String[] args) {
		new Init();
		new Init();
		
		new Init(1);
	}
}
//instance 블럭이 먼저 실행된다. 그다음 생성자가 실행된다.
//실행순서는 별 의미없다. 공통점이 더 강하기 때문이다.
//instance 블럭은 여러개 만들 수 있지만 이름이 없어서 만들어도 의미가 없다.
//instance 블럭은 꼭 실행된다.생성자는 콜 할지 말지 정할수있다.