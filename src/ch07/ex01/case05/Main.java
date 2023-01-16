package ch07.ex01.case05;

public class Main {
	public static void main(String[]args) {
		Car car = new FireEngine();
		car.run();
		//car.water(); car타입이기 때문에 물을 뿌리지 않는다.
		
		FireEngine fireEngine = (FireEngine)car;//fireEngine 로 casting
		fireEngine.water();
		fireEngine.run();
		
		((Car)fireEngine).run();
		
	}
}
