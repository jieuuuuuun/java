package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
		//슬롯을 만들자마자 공45개가 있어야 하기 때문에 생성자를 만들었다
		//new Slot을 하면 공 45개가 들어있다.
	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			balls[i] = null;//동일수 삭제하기위해 사용
		} while(ball == null);
		
		return ball;
	}
}
