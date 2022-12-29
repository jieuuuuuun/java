package home.ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		House house1 = new House();//현재 집이 있다.
		House house2 = null;//앞으로 생길꺼야!
		
		house1.setAddress("서울 강남구 역삼동");
		
		house2 = house1;
		System.out.print(house2.getAddress());
	}
}
