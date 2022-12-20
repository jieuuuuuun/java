package ch02.ex02;

public class C03Str {
 public static void main(String[] args) {
	 int a = 1;
	 int b = 2;
	 int c = 3;
	 int sum = a + b + c;
	 System.out.printf("sum: %d\n", sum);
	 
	 String sumStr = "" + sum;//sum=6 변수옆에 할당값이 있으면 write한다. 문자값이 있으면 궅히기 숫자를 문자로 바꿀때쓰는 알고리즘
	 System.out.println(sumStr);
	 
 	}
}
//클래스 사이즈의 string은 4바이트이다.
//현상관리 도구 GIT