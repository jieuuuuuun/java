package ch06.ex05.case01;

public class Shoes extends Product {
	private int price;
	
	public Shoes(int price) {
		super(price * 2);
		this.price = price;
	}
	
	@Override
	public int getPrice() {
		//return this.price; shoes의 price값이다.
		return super.getPrice();//product price의 값이다.
	}
}
