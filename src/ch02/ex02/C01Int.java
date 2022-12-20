package ch02.ex02;

public class C01Int {
	 public static void main(String[] args) {
		 int x = 10;//decimal 10진수
		 System.out.println(Integer.toBinaryString(x));
		 
		 x = 012;//8진수, octal 앞에 0을 써주면 컴파일러가 8진수로 인식한다. Binary 두개라는 뜻
		 System.out.println(Integer.toBinaryString(x));
		 
		 x = 0xA;//hexa 16진수
		 System.out.println(Integer.toBinaryString(x));
		 
		 x = 0b1010; //0b를쓰면 2진수 
		 System.out.println(Integer.toBinaryString(x));
		 
		 x = 1_234_567; //천다위 구분기호로_언더스코어를 쓴다.
		 System.out.println(x + 1);
		 
		 double y = 1e1;//10의1승을 표현한 것이다.
		 System.out.println(y);
	 }
}
//데이터와 리터럴을 동의어로 사용한다.
