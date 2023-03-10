package ch06.ex04.case03;
//원은 점이다 로 디자인해서 나쁜코드이다. Circle is a Point
public class Circle extends Point{
	private int r;
	
	//과제: 위 compile error를 해결하도록, 생성자를 기술하라.
	
	public Circle(int x, int y, int r){
		super(x, y);
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", this.getX(), this.getY(), r);
	}
	
}
