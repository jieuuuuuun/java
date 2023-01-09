package ch08.ex02.case04;

public enum Job {
	EXIT, LIST, ADD, FIX, DEL;
	
	public static final Job valueOf(int ordinal) {
		return values()[ordinal];
	}
}
//valueOf 스트링이 있었으니 valueof(int ordinal)을 오버로딩한것이다.