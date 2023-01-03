package ch06.home.ex04.case03;
//원은 점이다 로 디자인해서 나쁜코드이다.
public class Circle{
	private Point point;
	private int r;
	
	//과제: 위 compile error를 해결하도록, 생성자를 기술하라.
	
	public Circle(Point point, int r){
		this.point = point;
		this.r = r;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %d",this.point , this.r);
	}
	
}
//객체는 데이터이다.