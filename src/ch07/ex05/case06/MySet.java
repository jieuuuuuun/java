package ch07.ex05.case06;

import java.util.HashSet;
import java.util.Set;

public class MySet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
		System.out.println(set);
	}
}
//set은 중복값이 없다.
//set은 키가 없다.
//벨류만 있다. 
//리스트는 키가 있기때문에 중복값이 있다.