package ch09.ex01;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

//집행자
public class C02Executor {
	public static void main(String[] args) {
		Runnable r1 = () -> {
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		};
		
		Runnable r2 = () -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		};
		
		Executor executor = Executors.newCachedThreadPool();//Cached뭔가를 저장해준다.
		executor.execute(r1);
		executor.execute(r2);
	}
}
