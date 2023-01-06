package home.ch07.ex04.case05;

import home.ch07.ex04.case05.dao.ScoreDao;
import home.ch07.ex04.case05.dao.ScoreDaoImpl;
import home.ch07.ex04.case05.domain.Score;
import home.ch07.ex04.case05.presentation.ScoreIo;
import home.ch07.ex04.case05.service.ScoreService;
import home.ch07.ex04.case05.service.ScoreServiceImpl;

public class Main {
	public static void main(String[] args) {
		ScoreDao scoreDao = new ScoreDaoImpl(new Score[5]);
		ScoreService scoreService = new ScoreServiceImpl(scoreDao);
		ScoreIo scoreIo = new ScoreIo(scoreService);
		
		scoreIo.play();
	}
}
