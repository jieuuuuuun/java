package home.ch05.home.ex05.case06;

public class Main {
	public static void main(String[] args) {
		Phone phone = new Phone();
		Person person = new Person();
		
		phone.setMakerName("삼성");
		phone.setPrice(1_000_000);
		
		person.setPersonName("최한석");
		
		person.setPhone(phone);
		
		phone.message();
		phone.call();
		phone.game();
	}
}
