package controller;

import model.Databases;
import model.Student;
import view.MenuView;

public class MainController {
	public static void handleNameInput(String name) {
		Student found = null;
		
		try {
			// 이름으로 기존 학생 db에서 사용자 검색
			for (Student s : Databases.getStudents()) {
				if (s.getName().equals(name)) {
					found = s;
					break;
				}
			}
			
			// 못 찾으면 예외처리
			if (found == null) {
				throw new Exception("해당 이름의 학생이 없습니다.");
			}
			
			// 찾으면 currentUser로 저장
			Database.setCurrentUser(found);
			MenuView.displayMenu();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
