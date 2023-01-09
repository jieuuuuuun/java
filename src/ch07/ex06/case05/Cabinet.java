package ch07.ex06.case05;
//A이하(A를 상속받은것들)
public class Cabinet<T extends A> {
	public T getLastVal(T[] arr) {
		return arr[arr.length -1];
	}
	
	public <S extends C> S getFinalVal(S[] arr){
		return arr[arr.length - 1];
	}
}
