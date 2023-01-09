package ch07.ex05.case10;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		Bumblebee bumblebee = new Bumblebee();
		Prime prime = new Prime();
		List<Autobot> corps	= new ArrayList<>();
		
		corps.add(bumblebee);
		corps.add(prime);
		
		for(Autobot autobot: corps) {
			autobot.run();
			autobot.fight();
			//autobot.guard();
			
			if(autobot instanceof Bumblebee bot) bot.guard();//true면 bot에 들어간다. 그리고 bot로 선언한다.
			if(autobot instanceof Prime bot) bot.command();
		}
	}
}
