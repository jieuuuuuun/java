package ch05.home.ex01.case04;

import java.time.LocalDate;

public class User {
	private String userName;
	private int age;
	private LocalDate userDate = LocalDate.now();
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getUserName() {
		return this.userName;
	}
	public int getAge() {
		return this.age;
	}
	public void setUserDate(LocalDate userDate) {
		userDate = LocalDate.now();
		if(userName =="" && age == 0)
			this.userDate = LocalDate.now();
	}
	public LocalDate getUserDate() {
		return this.userDate;
	}
}
