package home.ch04;

public class EX01C03If {
	public static void main(String[]args) {
		int hour = 20;
		
		/*if(hour < 12) {
			System.out.println("Good Morning");
		} else if(hour < 18) {
			System.out.println("Good Afternoon");
		} else if(hour < 21) {
			System.out.println("Good evening");
		} else {
			System.out.println("Good night");
		}*/
		
		String bow = "";
		if(hour < 12) bow = "Good Morning";
		else if(hour < 18) bow = "Good Afternoon";
		else if(hour < 21) bow = "Good evening";
		else bow = "Good night";
		
		System.out.println(bow);
	}
}
