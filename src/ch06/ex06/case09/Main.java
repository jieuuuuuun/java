package ch06.ex06.case09;

public class Main {
	public static void main(String[] args) {
		Console console = new Console();
		Browser browser = new Browser();
		Chrome chrome = new Chrome();
		
		console.out();
		browser.out();
		
		
		UI.in();
		//console.in(); 상속받지 못함
		//browser.in(); 인터페이스에 있는 것은 상속되지 않는다.
		//Console.in();
		//Browser.in(); 어떤식으로 써도 상속받지 못함, 물론 상속할 필요도 없다.
		
		chrome.out();
		//chrome.in();
		//Chrome.in();
	}
}
