package home.ch03;

public class C07StrCompare {
	public static void main(String[]args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(s);
		b = s == "a";
		
		b = s.equals("a");
		
		System.out.println(b);
	}
}
