package home.exho;

import java.time.LocalDate;
import java.util.Scanner;

public class Reservation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = 0;
		int month = 0;
		int day = 0;
		
		System.out.println("공연 일자를 입력하세요");
		System.out.print("년: "); year = sc.nextInt();
		System.out.print("월: "); month = sc.nextInt();
		System.out.print("일: "); day = sc.nextInt();
		
		LocalDate showDate = LocalDate.of(year,  month, day);
		
		System.out.println();
		System.out.print(showDate + "공연을 예매했습니다.\n");
		System.out.print(showDate.minusDays(3) + "까지 환불이 가능합니다.");
	}
}
