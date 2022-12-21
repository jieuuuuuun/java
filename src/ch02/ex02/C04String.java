package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
		String  s = "|" + " a happy ".trim() + "|";//trim 머리와 꼬리 제거
		s = s.concat(" dog");//주어에 목적어를 붙이는 역할을 한다.
		s = s.substring(2);//substring 지정한 인덱스 이하의 문자열을 잘라내기한다.
		System.out.println(s);
		
		s = "hello";
		System.out.printf("%c\n", s.charAt(1));//charAt 문자열에서 문자하나를 선택할때쓴다.
		
		int i = "apple".codePointAt(0);//code는 유니코드이다.
		i = "a".hashCode();//hachCode는 결국 유니코드값이다.
		i = "b".hashCode();
		i = "b".compareTo("a");//보다크면 양수 보다작으면 음수
		i = "a".compareTo("b");
		i = "A".compareTo("a");
		i = "A".compareToIgnoreCase("a");//같은걸로 인식한다.
		i = s.indexOf("l");//첫번째있는 ㅣ인덱스를 리턴한다.
		i = s.lastIndexOf("l");
		i = s.length();
		System.out.println(i);
		
		s = "develop";
		boolean b = s.startsWith("de");
		b = s.endsWith("lop");
		b = s.equals("develop");
		b = s.equals("Develop");
		b = s.equalsIgnoreCase("Develop");
		b = "".isEmpty();
		b = s.matches("[a-zA-Z]*");
		b = s.matches("[0-9]*");
		
		System.out.println(b);

	}
}
//|a happy| dog 