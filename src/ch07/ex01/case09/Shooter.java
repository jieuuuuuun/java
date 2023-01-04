package ch07.ex01.case09;

public class Shooter {
	private Gun gun;//gun 은 의존객체이다.
	
	public void fire() {
		this.gun.fire();
	}
	
	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
