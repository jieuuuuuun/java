package home.ch04;

public class EX01C04Condition {
	public static void main(String[]args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good");
		
		char b = 'b';
		if('a'< b && b <'c') System.out.println("good");
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0);
			System.out.printf("x: %d, y: %d\n", x, y);
		
		String s = "HE";
		if(s.equals("he") || s.equals("HE") || s.equals("He") || s.equals("hE"))
			System.out.println(s);
		
		if(s.equalsIgnoreCase("he"))
			System.out.println(s);
		
		s = "";
		if(s.equals("")) System.out.println("값이 없다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}
