package ch07.ex04.case06;

public class Main {
	public static void main(String[] args) {
		Animal[] animals = new Animal[3];//동물의 우리 준비했다. 
		
		animals[0] = new Cat("해롱이");
		animals[1] = new Dog("왈왈이");
		animals[2] = new Dog("성큼이");
		
		for(Animal animal: animals)
			System.out.println(animal);
		
		Object[] objs = new Object[3];
		objs[0] = new Cat("해롱이");
		objs[1] = new Dog("왈왈이");
		objs[2] = new Dog("성큼이");
		
		for(Object obj: objs)
			System.out.println(obj);
	}
}
//animal로 확장성이 생겨 개, 고양이 다 배열에 포함시켜 호출 수킬 수 있다