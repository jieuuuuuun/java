package ch06.ex02.case02;

public class Parent {
	private String regNum;//레지테이션
	private String parentName;
	private int money;
	
	private String getRegNum() {
		return regNum;
	}
	
	public String getParentName() {
		return parentName;
	}
	
	protected int getMoney() {
		return money;
	}
	
	void addMoney(int money) {
		this.money += money;
	}//재산이 누적되도록 addMoney메소드 만들었다.
	//물어는 볼 수 있게 public으로 선언했다.
}
