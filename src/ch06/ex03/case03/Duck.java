package ch06.ex03.case03;
//extends Object 내가쓰지 않으면 자동 추가된다. extends 다음 class는 하나만 올 수 있다.
public class Duck extends Object{
	@Override
	public  String toString() {
		return "오리";
	}
}
//object클래스 부모를 여러개 주면 유지보수가 힘들기 때문에 안쓰게 되었다.