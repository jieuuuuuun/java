package ch07.ex06.case07;

import java.util.ArrayList;

public class Container<E> extends ArrayList<E> {
	public void contain(E thing) {
		this.add(thing);
	}
}
//가독성을 높이기 위해add를 포장하고 있는 것이다.