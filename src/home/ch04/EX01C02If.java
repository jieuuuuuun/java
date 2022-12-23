package home.ch04;

public class EX01C02If {
	public static void main(String[] args) {
		int visitCnt = 1;
		
		if(visitCnt < 1) {
			System.out.println("첫방문입니다.");
			visitCnt++;
		} else {
			System.out.println("재방문입니다.");
		}
		if(visitCnt < 1) System.out.println("첫방문입니다.");
		else System.out.println("재방문입니다.");
	}
}
