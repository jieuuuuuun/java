package ch05.ex05.case06;

public class Shooter {
	//과제: 총잡이가 총을 소지한다. 를 디자인하라.shooter has a gun
	private Gun gun;//dependency-의존객체이다.
	
	public void fire() {
		gun.fire();
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
