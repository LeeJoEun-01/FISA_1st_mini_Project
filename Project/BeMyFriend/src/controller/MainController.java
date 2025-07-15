package controller;

import model.StudentDAO;

import java.util.ArrayList;

import model.Student;
import view.MenuView;

public class MainController {
	
	public static void handleNameInput(String name) {
		try {
            // DB에서 학생 조회
            Student foundStudent = StudentDAO.findStudentByName(name);

            // 없으면 예외 처리
            if (foundStudent == null) {
                throw new Exception("해당 이름의 학생이 없습니다.");
            }

            // 있으면 currentUser에 저장
            StudentDAO.setCurrentUser(foundStudent);

            // 다음 메뉴로 이동
            MenuView.displayMenu();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
	}
	
	public static void addStudent(Student student) throws Exception {
		StudentDAO.insertStudent(student);
	}
	
	public static void updateStudent(Student student) throws Exception {
	    StudentDAO.updateStudent(student);
	}

	public static void deleteCurrentUser() throws Exception {
	    Student current = StudentDAO.getCurrentUser();

	    if (current == null) {
	        throw new Exception("현재 로그인한 사용자가 없습니다.");
	    }

	    StudentDAO.deleteStudent(current.getName());
	    StudentDAO.setCurrentUser(null);
	}
}