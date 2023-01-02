package ch05.ex09.case01;

import ch05.home.ex06.Console;

public class Init {
	private static int s;//static variable
	private int i;//instance variable

	static {
		Init.s = 1;
		//this.i = 1;
		Console.info("static{}");
	}
	
	{
		this.i = 1;
		Init.s = 1;
		Console.info("{}");
	}//instance에 static은 사용가능하다.
	
	{
		Console.info("{}2");	
	}
	
	public Init() {
		Console.info("Init{}");
	}//기본생성자 추가하면 에러 없어진다.
	
	public Init(int i) {
		Console.info("Init(int)");
	}
}//테스트는 중간중간 메시지를 출력해본다. 알고리즘 중간중간 스테이트 확인 한다.
