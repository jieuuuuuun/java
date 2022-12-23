package ch03.ex09;

public class C01Ternary {
	public static void main(String[] args) {
		int x =1;
		int y = -1;
		
		int absX = (x>=0) ? x : -x;// 절대값구하는 알고리즘
		int absY = (y>=0) ? x : -y;
		
		System.out.println(absX + ", " + absY);
	}
}
