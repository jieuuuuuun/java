package ch06.home.ex03.case02;

import ch05.home.ex06.Console;

public class Actor extends Entertainer {
	@Override
	public void play() {
		Console.info("연기하다.");
	}
}
