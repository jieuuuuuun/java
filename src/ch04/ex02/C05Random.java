package ch04.ex02;

public class C05Random {
	public static void main(String[] args) {
		int a = (int)(Math.random() * 10) + 1;//0.0이상 10.0미만.(int)로 캐스팅하면 0이상 10미만
		System.out.println(a);
	}
}
