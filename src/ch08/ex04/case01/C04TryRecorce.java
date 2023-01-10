package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C04TryRecorce {
	public static void maian(String[] args) {
		int[] arr = {1, 2, 3};
		
		try (
			PrintWriter out1 = new PrintWriter(new FileWriter("c:/DEV/1.txt"));//out객체같은 리소스를 생성한다. 
			PrintWriter out2 = new PrintWriter(new FileWriter("c:/DEV/2.txt"));
		){
			for(int i = 0; i < arr.length; i++){
				out1.println("arr[" + i + "]" + arr[i]);
				out2.println("arr[" + i + "]" + arr[i]);
			}
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		}
		System.out.println("end");
	}
}
//자식에서 부모순서로 코딩한다.