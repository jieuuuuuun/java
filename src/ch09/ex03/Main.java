package ch09.ex03;

public class Main {
	public static void main(String[] args) {
		Counter counter = new Counter();
		new Player(counter).start();//thread 1개 run()을 시작
		new Player(counter).start();
		new Player(counter).start();
	}
}
