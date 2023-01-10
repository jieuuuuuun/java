package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");//throw 다음은 exception을 준비해야한다. throw는 exception 발생시켜 라는 뜻이다.  
		} catch(LengthException e) {
			e.printStackTrace();
		}
		
		throw new NumberException("숫자가 아닙니다.");//try블럭으로 안묶어도 된다.
	}
}
//try라는 블럭은 가독성이 떨어진다.
//현장에서exception을 디자인해야 할 경우 RuntimeException 사용을 추천한다.
//log - 메세지 , 어떤 속성이 있어야 log라고 불릴수있다. 한국어로 역사, 시간이있어야 역사라고 할 수 있다.