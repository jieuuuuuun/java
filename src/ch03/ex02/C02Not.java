package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false;//전원이 꺼져있다.flag variable, toggle,플래그변수
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
