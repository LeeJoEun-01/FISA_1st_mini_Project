package controller;

import model.StudentDAO;
import view.FailView;
import view.StudyView;

public class StudyController {
	private static final StudentDAO model = StudentDAO.getModel() ;
	
	public static void searchStudy(String studyName) {
		String[] data = null;
		try {
			data = model.getStudyWithMe(studyName);
			StudyView.print(studyName, data);
		} catch (Exception e) {
//			e.printStackTrace();
			FailView.print(e.getMessage());
		}
	}
}
