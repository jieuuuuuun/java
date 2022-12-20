package ch02.ex01;

public class C02Output { //full name. short name
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100);// parameter로 상수 100, 100은 constant가 아니다,println은 리턴이 없다.
		System.out.println(score); //parameter로 variable
		System.out.println(100 + 1);// 수식, 계산식, expression-값을 표현한다.
		System.out.println(Math.random()); //method, random은 리턴 있다. 0.0이상1.0미만을 랜덤한다.
		
		System.out.print(200);
		System.out.print(300);
		System.out.print('\n'); //''char타입 ""string타입 '\n'하나의 특수 문자이다.\는 enter문자
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); //%b 블리언타입 separator
		//과제: 위 출력문에서 구문자로 /를 사용하라.
		System.out.printf("%b/%c/%d/%f/%s\n", true, 'a', 10, 1.15, "hello");
		
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n",true, 'a', 10, 1.156, "hello");//왼쪽정렬 원하면 -음수로 표시
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();//줄바꿈용
		System.out.println(name + "은 " + age + "살입니다."); //snippet,피연산자에 문자가 하나라도 들어가면 concatenate(굳히기)이다.,expression으로 값을 표현했다.
	}
}
