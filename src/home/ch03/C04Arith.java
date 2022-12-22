package home.ch03;

public class C04Arith {
	public static void main(String[]args) {
		byte a = 3;
		byte b = 2;
		
		byte c = (byte)(a + b);
		System.out.println(c);
		
		c++;
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d);
		//과제 
		d = (double)a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
	}
}
