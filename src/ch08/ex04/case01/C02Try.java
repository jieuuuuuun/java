package ch08.ex04.case01;

public class C02Try {
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		try {
			int result = arr[10];
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("error.");
		} //vm한테 exception을 떠넘기지 않기위한게 try이다.
		
		System.out.println("end.");
	}
}
//이벤트를 객체로 표현한 것 출석, 예매, 퇴근 등등등 ,엣지케이스
//exception이 발생해도 앱을 살리기위해서 try 블럭을 를 사용한다.