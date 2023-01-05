package ch07.ex04.case02;

public class Main {
	public static void main(String[] args) {
		Cat[] cats = new Cat[3];//고양이 집을 만들었고 고양이는 3마리가 있습니다.
		
		cats[0] = new Cat("헤롱이");
		cats[1] = new Cat("야코미");
		cats[2] = new Cat("새코미");
		
		// cats[2] = new Dog(); 컴파일 에러
		
		for(Cat cat: cats) System.out.println(cat);
	}
}
