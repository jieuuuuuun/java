package ch06.ex04.case01;

public class Cat extends Animal{
	private int age;
	
	public Cat(String catName, int age) {
		super(catName);//부모 멤버변수가 먼저 초기화된다. 라는것을 읽을 줄 알아야한다.
		//this.animalName = catName; 은 컴파일 에러, private 으로 선언되어있기때문이다.
		this.age = age;
	}
	
	public int getAge() {
		return this.age;
	}
	
	@Override
	public String toString() {
		return String.format("%s %d", this.getAnimalName(), this.getAge());
	}
}
//부모의 멤버와 멤버 메소드를 상속받는다 생성자는 상속받지 않는다
//내가 코딩하지 않아도 public Cat() {super();} 기본생성자가 있다.
//컴파일에러 해결방법 super도 기본생성자 생성안할거면 직접 코딩해줘야한다.
