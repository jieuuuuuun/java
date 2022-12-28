package ch05.ex01.case01;

public class Main {
	public static void main(String[] args) {
		int hour = 12;
		int minute = 35;
		int second = 30;
		System.out.printf("%d시 %d분 %d초\n",hour, minute, second);
		//stack
		Time time = new Time();//new Time();현재는 시간이 없는 투명한존재이다. //객체는 자동으로 필드들이 초기화된다. 초기화 값은 데이터 타입들의 기본값으로 들어간다.int=0
		time.hour = 12;//time객체의 hour라는 필드에다 12값을 할당한다.
		time.minute = 35;
		time.second = 30;
		System.out.printf("%d시 %d분 %d초\n", time.hour, time.minute, time.second);
		
		Time time2 = new Time();//stack
		time2.hour = 10;
		time2.minute = 30;
		time2.second = 27;
		System.out.printf("%d시 %d분 %d초\n", time2.hour, time2.minute, time2.second);
		
		System.out.println(time);
		System.out.println(time2.toString());//time,time2 객체주소가 서로 다르다. 변수명으로 객체를 구분하면 된다.
	}//메서드 바디가 끝나면 변수들이 사라진다. 모든객체는 toString을 다 가지고 있다.
}
