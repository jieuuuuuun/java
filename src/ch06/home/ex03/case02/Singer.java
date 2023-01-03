package ch06.home.ex03.case02;

import ch05.home.ex06.Console;

public class Singer extends Entertainer {
	@Override
	public void play() {
		Console.info("노래하다.");//라라라 라고 실감나게 해도 된다.
	}
}
