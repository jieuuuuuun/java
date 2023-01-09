package ch08.ex02.case03;

public class Main {
	public static void main(String[] args) {
		String name = Way.LEFT.name();//코드 네임
		int ordinal = Way.LEFT.ordinal();//코드 벨류
		name = Way.RIGHT.name();
		ordinal = Way.RIGHT.ordinal();
		System.out.printf("%s %d\n", name, ordinal);// LEFT 0  RIGHT 1  
		
		Way[] ways = Way.values();//way타임의 left, right를 담다.
		for(Way way: ways) System.out.print(way + " ");//LEFT RIGHT
		System.out.println();
		
		Way way = Way.valueOf("LEFT");
		System.out.println(way);
	}
}
//요소들 엔트레이?