package ch04.ex02;

public class C01Switch {
	public static void main(String[] args) {
		int grade = 2;
		String coupon = "";
		//연산자 표시가 없지만 암묵적으로 == 연산자만사용한다. 
		switch(grade) {
		case 1 -> coupon = "5만원";
		case 2 -> coupon = "1만원";
		default -> coupon = "1천원";//1번짹 문법에서는 default 선택사항이다.
		}
		//실행문이 있다.
		System.out.println(coupon);
	}
}
