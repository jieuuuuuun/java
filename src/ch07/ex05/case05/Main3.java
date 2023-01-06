package ch07.ex05.case05;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
	public static void main(String[] args) {
		Floor floor1 = new Floor();
		Floor floor2 = new Floor();
		House house = new House();
		
		for(int i = 0; i < 3; i++) {
			floor1.add(new Cat("고양이" + i));
			floor2.add(new Cat("양옹이" + i));
		}
		System.out.printf("%s\n%s\n", floor1, floor2);
		
		house.add(floor1);
		house.add(floor2);
		System.out.println(house);
		
		//과제: house의 고양이 여섯 마리에게 밥을 먹여라.
		for(Floor floor: house)
			for(Cat cat: floor) cat.eat();
	}
}
/*
과제:
List<Cat> -> Floor
List<List<Cat>> -> House
로 refactoring 하라.
한 번 해본것 main2정도로 가깝게 할 수 있으면 된다.
*/
