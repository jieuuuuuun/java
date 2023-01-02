package ch05.ex05.case10;

public class Man {
	public void strip() {}
	public void wash() {}
	public void wear(Pajamas pajamas) {}
	public void lie() {}
	
	public void sleep(Pajamas pajamas) {
		this.strip();
		this.wash();
		this.wear(pajamas);
		this.lie();
	}//남자는 this변수에 담긴다. this 생략가능하다.
}
