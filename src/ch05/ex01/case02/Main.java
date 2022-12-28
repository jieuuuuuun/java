package ch05.ex01.case02;

public class Main {
	public static void main(String[] args) {
		String userName = "최한석";
		int age = 35;
		
		User user = new User();
		user.userName = "최한석";//할당연산자 없으면 읽기이다.
		user.age = 35;
	}//method body 종료
}//vm 죽이면 데이터 사라진다.
//state 데이터이다. variable로 표현할 것이다. 동사는 메서드로 표현한다.
/*
 class main - method area에 loading한다.
 stack에 쌓인다. args-userName최한석-age35-userA71-
 constant area 상수쌓이는곳- 최한석, 어딘가에 35
 class user 파악이 되면
 heap에 userName,age,A71
 */
 