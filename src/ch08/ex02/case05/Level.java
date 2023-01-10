package ch08.ex02.case05;

public enum Level {
	GOLD(3, null), SILVER(2, GOLD), COPPER(1, SILVER);
	
	private final int value;
	private final Level next;
	
	private Level(int value, Level next) {
		this.value = value;
		this.next = next;
	}
	//레코드 흉내를 내본것이다. 이미유행했음
	public int value() {
		return this.value;
	}
	
	public Level next() {
		return this.next;
	}
}
//enum의 생성자는 꼭 private으로 만든다. 내부에서 생성하고 끝내야한다.