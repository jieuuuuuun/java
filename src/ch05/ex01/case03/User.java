package ch05.ex01.case03;

public class User {
	private String userName;//private 감추다.access - 읽기쓰기
	private int age;
	       //리턴타입 메소드네임 (파라미터) {}바디부분은 transparent하다.
	public void setUserName(String userName) { //setter
		this.userName = userName;
	}//this(변수)User타입이 들어왔고, 알고리즘한다. 
	//void로 return이 없다를 표현한다.set(동사여야한다.)UserName을쓰다.
	//메소드는 객체가 아니다. set콜 get읽기
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getUserName() {//getter
		return this.userName;
	}
	
	public int getAge() {
		return this.age;
	} // accessor
}
