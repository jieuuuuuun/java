package home.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		byte b = 127;
		
		b++;
		b++;
		System.out.println(b);
	}
}
