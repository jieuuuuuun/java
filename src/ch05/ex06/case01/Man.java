package ch05.ex06.case01;

public class Man {
	public static void say(String msg) {
		System.out.println(msg);//static 자바의 성격을 무너트린다.
	}//static 메서드는 객체지향을 파괴한다. 주어에 관심이 없다., 메서드는 서술이다.
	
	public void tell(String msg) {
		System.out.println(msg);
	}//메서드 에어리어에 있다.
}
