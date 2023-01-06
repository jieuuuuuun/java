package ch07.home.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Slot {
	private List<Ball> balls;
	
	public Slot() {
		balls = new ArrayList<>();
		
		for(int i = 1; i < 45; i++)
			balls.add(new Ball(i));
		//슬롯을 만들자마자 공45개가 있어야 하기 때문에 생성자를 만들었다
		//new Slot을 하면 공 45개가 들어있다.
	}
	
	public Ball chuck() {
		int	i = (int)(Math.random() * balls.size());
		return balls.remove(i);
	}
	
}
