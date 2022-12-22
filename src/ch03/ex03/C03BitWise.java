package ch03.ex03;

public class C03BitWise {
	public static void main(String[] arge) {
		int x = 10;
		System.out.printf("%s, %d\n",
				"0000000000000000000000000000" + Integer.toBinaryString(x),x);
		
		x = ~x;
		System.out.printf("%s, %d\n",Integer.toBinaryString(x),x);
	}
}