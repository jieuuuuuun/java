package ch08.ex05;

import java.util.logging.Logger;

public class C01MyLogger {
	public static void main(String[] args) {
		Logger.getGlobal().info("hello");//info 등등은 로그 수준에 따라서 골라쓰면 된다.
	}
}
