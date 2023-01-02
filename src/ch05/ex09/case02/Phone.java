package ch05.ex09.case02;

public class Phone {
	private static int cnt;//카운트 값은 공유해야하기 때문에 static베리어블 사용했다.
	private int serial;
	
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {}
	
	public Phone(int serial) {
		this.serial = serial;
	}//내가 고를 수 있다는 생성자이다. 
	
	public int getSerial() {
		return this.serial;
	}
}
