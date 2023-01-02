package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {
		this.babyName = babyName;
	}//생성자를 늘리게 되면 오버로딩이 필수다.write new로만 호출된다. 객체생성하자마자 멤버변수를 쓰고싶어한다.
	
	public void setBabyName(String babyName) {
		this.babyName = babyName;
	}//객체.baby로 호출한다. 객체가 생성된 뒤에 멤버변수값을 write한다.
}
