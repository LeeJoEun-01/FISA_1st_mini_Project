package controller;

import model.StudentDAO;
import view.MatchView;

public class MatchController {
	
	public static double getCompatibility(String friendName) throws Exception {
		double score = 0.0;
		score = StudentDAO.calCompatibility(friendName);
		if (score == 0.0 ) {
			throw new Exception("궁합을 계산할 수 없습니다.");
		}
		return score;
	}
}
	