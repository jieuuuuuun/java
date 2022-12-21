package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		//byte b = 128; 컴파일 에러
		byte b = 127;
		//b = b + 1; 컴파일 에러
		
		b++;//b = b + 1의 문장을 줄여서 쓴것이다.
		b++;
		System.out.println(b);
	}
}
