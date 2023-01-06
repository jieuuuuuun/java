package ch07.ex05.case03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();	
		list.add(1);//0
		list.add(2);//1
		list.add(3);//2
		list.add(1);//3
		
		System.out.println(list);
		
		for(int i: list) System.out.print(i + " ");
		System.out.println();
		
		System.out.println(list.get(0));
		
		for(int i = 0; i < list.size(); i++)
			System.out.print(list.get(i) + " ");
		System.out.println();
		
		list.remove(1);
		System.out.println(list);//remove() 시 index 번호가 앞으로 하나씩 당겨진다. 즉 위치이동이 일어난다.
		
		//과제: list 의 모든 원소를 삭제하라.
		list.removeAll(list);//api를 잘 찾아서 해결하는게 좋다
		System.out.println(list);
		
		list = new ArrayList<>(Arrays.asList(1, 2, 3, 1));//끝값부터 지우면 자리이동이 안일어난다.
		for(int i = list.size() - 1; i >= 0; i--)
			list.remove(i);
		System.out.println(list);
	}
}
//배열의 단점(사이즈 조절이 안된다.)을 보안한게 List이다.(현장에서 이제 배열이아닌 List를 사용한다.)
//Hr 과제 만들때도 적극적으로 List를 사용해서 만들면된다.