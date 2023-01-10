package ch09.ex01;

public class C01Counter {
	public static void main(String[] args) {
		System.out.println("main start.");
		
		Thread thread1 = new Thread(() ->{
			for(int i = 0; i < 10; i++)
				System.out.print(i + " ");
		});//업무지시상태
		
		Thread thread2 = new Thread(() -> {
			for(char c = 'a'; c <= 'z'; c++)
				System.out.print(c + " ");
		});
		
		thread1.start();
		thread2.start();//main이 하는일이 너무 없어서 출력순서가 메인보다 늦게끝난것이다. 
		
		System.out.println("main end.");
	}
}
