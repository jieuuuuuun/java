package home.ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		this("레드향");
	}
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}
