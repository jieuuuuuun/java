package ch08.ex04.case01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class C03Try {
	public static void main(String[] args) {
		PrintWriter out =null;
		int[] arr = {1, 2, 3};
		
		try {
			out = new PrintWriter(new FileWriter("c:/Dev/a.tex"));
			for(int i: arr) out.println("arr[" + i + "]: " + arr[i]);
		} catch(ArrayIndexOutOfBoundsException e) {
			out.println("array error.");
		} catch(IOException e) {
			System.out.println("IO error.");
		}finally {
			if(out != null) out.close();// finally에 있는 것은 꼭 실행한다. 컴퓨터 전원을 끄다.
		}
		
		System.out.println("end.");
	}
}
//catch 블럭은 n개 생성가능 catch블럭은 배타적이다.
