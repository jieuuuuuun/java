package ch05.home.ex01.case01;

public class Main {
	public static void main(String[]args) {
		Flower flower1 = new Flower();
		Flower flower2 = new Flower();
		
		flower1.flowerName = "창포꽃";
		flower1.petalLength = 7;
		flower1.sepalLength = 2;
		
		
		flower2.flowerName = "코스모스";
		flower2.petalLength = 4;
		flower2.sepalLength = 1;
	}
}
/*
꽃 두송이 생각하고 각각의 데이터를 담고, 꽃잎길이 담고, 꽃받침 길이 담는 객체를 떠올려야한다. 

창포꽃은 꽃잎 길이가 7cm, 꽃받침 길이가 2cm 입니다.
코스모스는 꽃잎 길이가 4cm, 꽃받침 길이가 1cm 입니다.

콘솔 출력은 확인하려고 한것이다.
*/