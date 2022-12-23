package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) {
		case 1 -> "too short";
		case 2 -> "good";
		default -> "too long";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short";
		case 11 -> {yield"I don't know";}
		case 2 -> {
			String message = comment + " is good.";
			yield message;//case의 리턴값이에요 를 표시한다.
		}//논리를 정의하고 싶을때 {} 사용한다.
		default -> {yield comment + "is too long.";}
		};
		System.out.println(msg);
		
		// yield: 제한자이다. keyword x(예약어), restricted identifier o
		int yield = 1;
		System.out.println(yield);
		//int switch = 1; 나쁜코드
	}
}
