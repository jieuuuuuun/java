package ch09.ex03;

public class Player extends Thread {
	private Counter counter;
	
	public Player(Counter counter) {
		this.counter = counter;
	}
	
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			counter.increase();
			counter.decrease();
			
			if(i % 10 == 0) counter.print();
			
			try {
				Thread.sleep((int)(Math.random() * 2));//static 이라 클래스. 으로 한다. //thread를 상속받았으니 그냥 sleep으로 선언해도된다.
			} catch(InterruptedException e) {}
		}
	}
}
//Override 로 run을 가지고 있는것이고 start로 시작하게 하는것이다 