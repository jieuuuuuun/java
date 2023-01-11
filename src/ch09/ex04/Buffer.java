package ch09.ex04;
//임시공간
public class Buffer {
	private Integer val;
	
	public synchronized int remove() {
		while(val == null) {
		try {
				wait();//값이 없으면 wait
			}catch(InterruptedException e) {}
		}//null이면 생산자가 값을 넣어줄때까지 기다린다.
		
		int val = this.val;
		this.val = null;
		
		notifyAll();//불특정다수의 스레드를 깨운다.
		
		return val;
	}
	
	public synchronized void add(Integer val) {
		while(this.val != null) {
			try {
				wait();//값이 있으면 wait
			} catch(InterruptedException e) {}
		}
			
			this.val = val;
			notifyAll();

		}
	}

//buffer에서 get은 조회 , remove꺼내가는것이다.