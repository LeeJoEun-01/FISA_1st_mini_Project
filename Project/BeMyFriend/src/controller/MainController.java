package controller;

import model.StudentDAO;

import java.util.ArrayList;

import model.Student;
import view.MenuView;

public class MainController {
	
	public static void handleNameInput(String name) {
		String found = null;
		
		try {
			StudentDAO.getModel();
			// 이름으로 기존 학생 db에서 사용자 검색
			ArrayList<String> datas = StudentDAO.getAllStudent();
			for (String studentName : datas) {
				if (studentName.equals(name)) {
					found = studentName;
					break;
				}
			}
			
			// 못 찾으면 예외처리
			if (found == null) {
				throw new Exception("해당 이름의 학생이 없습니다.");
			}
			
			// 찾으면 currentUser로 저장
//			StudentDAO.setCurrentUser(found);
			MenuView.displayMenu();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}
}
