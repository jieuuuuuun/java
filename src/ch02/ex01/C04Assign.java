package ch02.ex01;

public class C04Assign {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		System.out.printf("%d,%d\n",a, b);
		
		a = b;
		System.out.printf("%d, %d\n", a, b);//최초 a=1값은 사라진다.
		
		a = b + 1;//오른쪽 read,왼쪽 write
		System.out.printf("%d, %d\n", a, b);//CRUD(Create Read Update Delete)
		
		double d = Math.random();//
		System.out.printf("%.2f", d);
	}
}
