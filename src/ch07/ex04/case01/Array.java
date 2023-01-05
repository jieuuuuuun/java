package ch07.ex04.case01;

public class Array {
	public static void main(String[] args) {
		String[] strs = new String[3];//[]안에 들어가는 값의 원소가 담긴다. 
		System.out.println(strs);
		
		Integer[] integers = new Integer[3];
		System.out.println(integers);
		
		int[] ints = new int[3];
		System.out.println(ints);
		
		System.out.printf("%d %d %d\n", integers[0], integers[1], integers[2]);
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		ints[0] = 0;
		ints[1] = 1;
		ints[2] = 2;
		System.out.printf("%d %d %d\n", ints[0], ints[1], ints[2]);
		
		for(int i = 0; i < ints.length; i++) ints[i] = i;
		
		for(int i = 0; i < ints.length; i++)
			System.out.print(ints[i] + " ");
		System.out.println();
		
		//colection
		for(int i: ints) System.out.print(i + " ");//<-for each 문법 iterating 할 일이 있으면 for each 사용하기
		
		int[] array = {0, 1, 2};
		array = new int[] {0, 1, 2};//데이터가 준비되어있을때 사용하는 방법이다.
	}
}
//String 타입의 원소들을 strs 에 담을꺼야, iterating array 를 차례대로 읽어내려가는 것이다.
//length