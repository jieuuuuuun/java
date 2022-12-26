package home.ch04;

public class EX03C01While {
	public static void main(String[]args) {
		int weight = 90;
		int jumpCnt = 0;
		
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}
		
		System.out.printf("%d번 줄넘기를 해서, 몸무게 %dkg이 되었습니다.", jumpCnt,weight);
	}
}
