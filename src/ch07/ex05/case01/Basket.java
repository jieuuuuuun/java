package ch07.ex05.case01;
//제너릭타입선언
public class Basket <E>{
	private E e;
	
	public E get() {
		return this.e;
	}
	
	public void set(E e) {
		this.e = e;
	}
}
//제너릭타입 시작!<E> 꺽세안에는 아무거나 써도된다.
//사과바구니가 될 수 있고 포도바구니가 될수도 있다.
//아무거나 넣을 수 있는 바구니이다.
//타입결정을 뒤로 미루는것이다.