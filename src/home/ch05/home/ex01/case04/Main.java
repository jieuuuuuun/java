package home.ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		User user = new User();
		String userName = null;
		int age = 0;
		LocalDate regDate = null;
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isGood = false;
		
		do {
			System.out.print("이름: ");
			userName = sc.nextLine();
			isGood = userName.matches("[a-zA-Z가-힣]+");
			if(isGood) user.setUserName(userName);
			else System.out.println("[ERROR] 이름을 입력하시오.");
		} while(!isGood);
		
		do {
			isGood = false;
			System.out.print("나이: ");
			tmp = sc.nextLine();
			isGood = tmp.matches("[0-9]+");
			if(isGood) age = Integer.parseInt(tmp);
			else System.out.println("[ERROR]나이를 입력하세요");
		}while(!isGood);
		
		regDate = LocalDate.now();
		
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				user.getUserName(),user.getAge(),user.getRegDate());
	}
}
