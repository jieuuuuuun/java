package ch06.ex02.case02.sub;

import ch06.ex02.case02.Parent;

public class Child extends Parent {
	public void play() {
		//this.getRegNum();
		this.getParentName();
		this.getMoney();
		//this.addMoney(1000);
	}
}
//parent 멤버변수 메소드 다 쓰지 못한다.