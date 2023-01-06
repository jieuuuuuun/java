package ch07.ex05.case04;

import java.util.ArrayList;
import java.util.List;

public class ScoreList {
	public static void main(String[] args) {
		List<Integer> score1 = new ArrayList<>();	
		List<Integer> score2 = new ArrayList<>();
		List<List<Integer>> scores = new ArrayList<>();//여기에 score1,2넣을예정인데 보면 score1,2의 타입인 List<Integer> 이기때문에 이렇게 전어준다
		
		for(int i = 0; i < 3; i++) {
			score1.add(80 + i);
			score2.add(90 + i);
		}
		System.out.printf("%s\n%s\n", score1,score2);
		
		scores.add(score1);
		scores.add(score2);
		System.out.println(scores);
	}
}
