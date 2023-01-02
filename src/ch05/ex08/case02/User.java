package ch05.ex08.case02;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate regDate;
	
	public User() {}
	
	public User(String userName, int age, LocalDate regDate) {
		this.userName = userName;
		this.age = age;
		this.regDate = regDate;
	}//멤버 베리어블을 한번에 초기화한다. 초기화일수밖에없다.

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setRegDate(LocalDate regDate) {
		this.regDate = regDate;
	}//각각 초기화한다. 초기화일수도 있고 아닐수도있다.
}
