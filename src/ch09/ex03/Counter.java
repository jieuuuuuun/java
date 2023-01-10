package ch09.ex03;

public class Counter {
	private int val;
	
	//synchronized락을 건다.
	public synchronized void increase() {
		val++;
	}//1놈이 콜하고 다 하고 락풀고 빠져나가야 남은 다음 플레이어가 실행할 수 있다. 실제 작업은 cpu가 한다.
	//cpu입장에서 vm은 player중 한놈이다. scope을 넓게봐라.
	
	public synchronized void decrease() {
		val--;
	}
	
	public synchronized void print() {
		System.out.print(val + " ");
	}
}
//내 프로세스가 시간 배정받아야 한다.
//싱크로즈?  동기화