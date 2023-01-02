package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향";//수확하자마자 레드향인것을 안다.
		this("레드향");//Citrus 명사를 대신하는 this는 대명사이다.
	}//코드로만 봤을때 나쁜 코드이다. 밑의 내용과 중복이다. 파라미터가 상수와 변수라는 것만 다르다. 
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName;
	}
}
//코드 중복을 제거하기위해 this사용한다.