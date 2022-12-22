package home.ch03;

public class C04DecimalPoint {
	public static void main(String[]args) {
		double pi = 3.141592;
		
		double shorPi = (int)(pi * 10) / 10.0;
		System.out.println(shorPi);
		
		shorPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shorPi);
		
		shorPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shorPi);
	}
}
