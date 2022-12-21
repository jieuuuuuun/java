package ch02.ex03;

public class C02DoubleInt {
	public static void main(String[] args) {
		double d =1.95;
		int i = (int)d;
		System.out.println(i);//큰수를 작은수로 바꿀때에는overflow를 각오해야한다,
		
		double f = Math.floor(d);
		double r = Math.round(d);
		System.out.printf("%.2f, %.2f\n", f, r);
		
		// 과제: = 오른편을 채워라. 
		int f2 = (int)f;
		int r2 = (int)r;
		System.out.printf("%d, %d\n", f2, r2);
	}
}
