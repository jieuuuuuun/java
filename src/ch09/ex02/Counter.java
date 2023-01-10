package ch09.ex02;

public class Counter implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + ": start.");
		
		for(char c = 'a'; c <= 'f'; c++) {
			System.out.println(Thread.currentThread().getName() + ": " + c);
			try {
				System.out.println(Thread.currentThread().getName() + ": sleep.");
				Thread.sleep(1000);//1000 m/s동안 재우(멈추)는 것이다. 
			} catch(InterruptedException e) {
				System.out.println(Thread.currentThread().getName() + ": interrupted.");
			}//방해하는 것이다.
		}
		
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
	
}
//스레드는 수동 자동 할당된다.
//run() 기능이다. 