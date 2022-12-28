package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		House house1 = new House();//현재 집이있다.
		House house2 = null;//앞으로 집이생길꺼야
		
		house1.setAddress("서울 강남구 역삼동");
		
		//과제: house1 의 키를 house2에 넘겨줬다.
		//      house1 의 주소를 house2 에 알려줬다. 키와 주소를 동의어로 씌인 것이다.
		house2 = house1;
		System.out.print(house2.getAddress());//확인용
	}
}
