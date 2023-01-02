package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();//new 다음 생성자 Baby()콜한다.
		baby.setBabyName("초롱이");//아기가 태어나고 나서 이름을 지었다.
		
		baby = new Baby("튼튼이");//배속에서 이미 튼튼이였다. 태어나자마자 튼튼이라는 이름을 가진다.
	}//new(연산자)가 실행되서 객체가 만들어진다.
}
