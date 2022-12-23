package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 6;
		
		String dayName = switch(day) {
		case 1 -> "sumday";
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednseday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default ->"none";
		};//리턴값이 있다.
		
		System.out.println(dayName);
	}
}
