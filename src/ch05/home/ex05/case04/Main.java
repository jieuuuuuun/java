package ch05.home.ex05.case04;

import java.time.LocalDate;

public class Main {
	public static void main(String[]args) {
		Man man = new Man();
		
		man.setManName("최한석");
		man.setAge(33);
		man.setBirthday(LocalDate.of(2025, 6, 7));
		
		man.sing();
		man.eat();
		man.run();
	}
}
/*
남자 객체만을 class로 디자인하라.
--

식당(객체)에서 한 남자가 다가와 앉습니다.
남자(객체)가 자기 소개를 합니다.
이름은 최한석, 나이는 33살, 생일은 2025-6-7 입니다.
(이름 나이 생일은 남자에게 종속되는 명사, 속성이다.)

남자는 음식(객체)을 기다리는 동안, 노래를 부릅니다.
음식이 나오자 맛있게 먹습니다.
다 먹더니, 계산 안 하고, 달려 나갑니다.

눈에 보이는 시각만 표현하라
 */