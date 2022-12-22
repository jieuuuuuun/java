package home.ch03;

public class C09Ternary {
	public static void main(String[]args) {
		int x = 1;
		int y = -1;
		
		int absX = (x>0) ? x : -x;
		int absY = (y>0) ? x : -y;
		
		System.out.println(absX + ", " + absY);
	}
}
