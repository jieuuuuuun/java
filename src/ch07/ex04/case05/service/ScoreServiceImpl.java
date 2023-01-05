package ch07.ex04.case05.service;

import ch07.ex04.case05.dao.ScoreDao;
import ch07.ex04.case05.domain.Score;

public class ScoreServiceImpl implements ScoreService {
	private ScoreDao scoreDao;
	
	public ScoreServiceImpl(ScoreDao scoreDao) {
		this.scoreDao = scoreDao;
	}
	
	@Override
	public void addScore(Score score) {
		scoreDao.insertScore(score);
	}
	
	@Override
	public Score[] getScores() {
		//return scoreDao.selectScores();//콜하고 Dao에서 데이터를 얻는다.
		Score[] scores = scoreDao.selectScores();
		this.calcScore(scores);
		return scores;
	}
	//과제: 학생별 합계, 평균 필드를 채워라.
	private void calcScore(Score[] scores) {//실행해서 합계 평균 채워준다.
		
	}
}
//테스트할게 없다. 단일테스트 필요없다.