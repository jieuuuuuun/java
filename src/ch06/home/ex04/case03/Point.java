package ch06.home.ex04.case03;

public class Point extends Circle {
	private int x;
	private int y;
	
	public Point(int x, int y, int r) {
		super(r);
		this.x = x;
		this.y = y;
	}
	@Override
	public String toString() {
		return String.format("(%d, %d), %d", x, y, getR());
	}
}
