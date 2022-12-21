package ch02.ex02;

public class C03String {
 public static void main(String[] args) {
	 int a = 1;
	 int b = 2;
	 int c = 3;
	 int sum = a + b + c;
	 System.out.printf("sum: %d\n", sum);
	 
	 String sumStr = "" + sum;//sum=6 변수옆에 할당값이 있으면 write한다. 문자값이 있으면 굳히기, 숫자를 문자로 바꿀때쓰는 알고리즘
	 System.out.println(sumStr);
	 
	 String s = a + b + "";//문자때문에 굳이기로 콘솔 숫자3이 아닌 문자 3이다.
	 System.out.println(s);
	 
	 s = "" + a + b;
	 System.out.println(s);
	 
	 String dialog = "John said, \"hello\".";
	 System.out.println(dialog);//""특수문자이다. 일반문자로 쓰고싶다면 앞에 역슬래시\를 넣는다.
 	}
}
//클래스 사이즈의 string은 4바이트이다.
//현상관리 도구 GIT