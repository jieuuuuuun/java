package ch03.ex08;

public class Logical {
	public static void main(String[] args) {
		boolean b = false;
		
		b = true && true;
		b = (2 > 1) && (2 > 1);
		b = 2 < 1 && 2 > 1;
		b = 2 < 1 || 2 > 1;
		b = 2 < 1 || 2 < 1;
		
		System.out.println(b);
		
		int x = 0;
		int y = 0;
		b = ++x < 0 && ++y < 0;//&&는 하나라도 거짓이면 거짓이기 때문에 앞에 수식이 이미 거짓이기 때문에 뒤의 값은 계산 안한다.
		
		x = 0;
		y = 0;
		b = ++x < 0 & ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x < 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 || ++y < 0;
		
		x = 0;
		y = 0;
		b = ++x > 0 | ++y < 0;
		
		System.out.printf("x: %d, y: %d, b: %b", x, y, b);
	}
}
