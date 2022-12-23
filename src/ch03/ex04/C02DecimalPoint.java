package ch03.ex04;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
public class C02DecimalPoint {
	public static void main(String[] args) {
		double pi = 3.141592;
		
		double shorPi = (int)(pi * 10) / 10.0;
		System.out.println(shorPi);
		
		//과제: pi 값을 소수점 이하 세자리로 조정하라.
		shorPi = (int)(pi * 1000) / 1000.0;
		System.out.println(shorPi);
		
		//과제: pi 값을 반올림해서, 소수점 이하 세자리로 조정하라.
		shorPi = Math.round(pi * 1000) / 1000.0;
		System.out.println(shorPi);//3.142
	}
}