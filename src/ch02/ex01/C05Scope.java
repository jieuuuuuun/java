package ch02.ex01;
//공간관점 scope 시간관점 life cycle
public class C05Scope {
	public static void main(String[] args) {
		int i = 0;//중복여부는 scope내에서 판단한다.
		//int i = 0;
		int j = 0;
		{
			//int i = 0;,블럭안에 블럭을 넣을 수 있고, 이름없는 블럭도 쓸 수있다.
			int x = 0;
			int y = 0;
		}//scope이 끝나면 블럭안 변수 x는 죽기 때문에 다음 블럭 안의 x변수 사용해도 상관없다.
		int x = 0;
	}
}

