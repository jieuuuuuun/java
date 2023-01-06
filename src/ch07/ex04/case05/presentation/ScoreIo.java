package ch07.ex04.case05.presentation;

import ch07.ex04.case05.domain.Score;
import ch07.ex04.case05.service.ScoreService;

public class ScoreIo {
	private ScoreService scoreService;
	
	public ScoreIo(ScoreService scoreService) {
		this.scoreService = scoreService;
	}
	
	/*public void play() {
		Score[] scores = new Score[5];
		
		for(int i = 0; i < scores.length; i++)
			scoreService.addScore(
					new Score((i + 1) * 10, (i + 1) * 10,(i + 1) * 10));

		scores = scoreService.getScores();//getScores();하게되면 합계 평균까지 얻게된다.
		for(Score score: scores)
		System.out.println();
	} 위의 주석은 점수를 임의로 넣어서 해본 테스트이다.*/
	
	// 과제: 5명의 국,영,수 점수를 user 가 입력토록 하라.
	//		 interface Console을 만든다.
	public void play() {
		int kor = 0;
		int eng = 0;
		int math = 0;
		
		for(int i = 0; i < 5; i++) {
			kor = Console.inNum("국어");
			eng = Console.inNum("영어");
			math = Console.inNum("수학");
			
		scoreService.addScore(new Score(kor, eng, math));
		}
		Score[] scores = scoreService.getScores();
		for(Score score: scores)
			Console.info(score);
	}
}
//utilty, trade off - 플러스가 있으면 마이너스가 있다. 