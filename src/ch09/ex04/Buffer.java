package ch09.ex04;
//임시공간
public class Buffer {
	private Integer val;
	
//	public synchronized int remove() {
//		while(val == null) {
//			try {
//				wait();
//			}
//		}//null이면 생산자가 값을 넣어줄때까지 기다린다.
//	}
}
//buffer에서 get은 조회 , remove꺼내가는것이다.