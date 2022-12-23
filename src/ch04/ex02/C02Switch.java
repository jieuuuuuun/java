package ch04.ex02;

public class C02Switch {
	public static void main(String[] args) {
		String grade = "silver";
		String coupon = "";
		
		switch(grade) {
		case "gold" -> coupon = "5만원";
		case "silver" -> coupon = "1만원"; //5만원으로 변경시 코드 중복된다.
		default -> coupon = "1천원";		
		}
		
		switch(grade) {
		case "gold", "silver" -> coupon = "5만원";//위의 내용이 해결된다. 기준값grade 데이터탑입 과 동일해야한다.
		default -> coupon = "1천원";		
		}
		
		System.out.println(coupon);
	}
}
