package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i;//작은수에서 큰수를 캐스팅한 것을 promotion이라고 한다.
		System.out.printf("%f, %d\n", d, i);
		
		//i = d;에러
		i = (int)d;
		System.out.printf("%f, %d", d, i);
	}
}
