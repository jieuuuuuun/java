package ch04.ex03;

public class C03While {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		//while은 0회이상 반복할때 쓴다
		//배고프면 먹는다. 30칼로리 미만이면 배고프다
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			
			if(food % 5 == 0) {
				System.out.println("상한 음식을 뱉다.");				
				break;//반복 블럭 빠져나온다.
			}
			
			calorie += food;
		}
		
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}
