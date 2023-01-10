package ch09.ex02;

public class Main {
	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread().getName()+ ": start");
		
		Thread counter = new Thread(new Counter());
		counter.start();
		
		int tries = 1;//양보할 횟수, counter thread가 살아있는지 확인
		while(counter.isAlive()) {
			if(tries <= 2) {
				counter.join(1000);
				System.out.println(Thread.currentThread().getName() + ": wait " + tries++);
			} else {
				System.out.println(Thread.currentThread().getName() + ": irritated.");	
				counter.interrupt();
				counter.join();//자고 있다는 것이 확인 되면 무한정 기다림
			}
		}
		System.out.println(Thread.currentThread().getName() + ": end.");
	}
}
//main,counter스레드 2개 존재한다.