package home.ch04;

public class EX02C03Switch {
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
		default -> "none";
		};
		System.out.println(dayName);
	}
}
