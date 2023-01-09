package ch07.ex06.case04;

public class Box {
	public <T> T getLastVal(T[] arr) {
		return arr[arr.length - 1];
	}
}
//제너릭 메소드 관련 내용
//메소드 블록