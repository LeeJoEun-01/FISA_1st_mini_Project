package controller;

import java.util.ArrayList;

import model.StudentDAO;
import view.FailView;
import view.StudyView;

public class StudyController {
	private static final StudentDAO model = StudentDAO.getModel() ;
	
	public static void searchStudy(String studyName) {
		ArrayList<String> data = null;
		try {
			data = model.getStudyWithMe(studyName);
			if (data.size() == 0) {
				FailView.print("자신을 제외하고 해당 스터디를 원하는 사람이 없습니다. ㅜㅅㅜ");
			} else {
				StudyView.print(studyName, data);				
			}
		} catch (Exception e) {
//			e.printStackTrace();
			FailView.print(e.getMessage());
		}
	}
}
