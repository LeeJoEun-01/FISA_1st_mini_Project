package controller;

import model.Student;
import model.StudentDAO;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.Random;

//public class RecommandController {
//    public static Student getRandomStudent() throws Exception {
//
//    	Student[] students = Model.getModel().getStudents();  
//
//        Random rand = new Random();
//        Student selected = students[rand.nextInt(students.length)];
//
//        if (selected == null) {
//        	 throw new Exception("추천하는 학생이 없어요ㅠㅠ");
//        }
//		return selected;
//    }
//}


public class RecommandController {

    public static Student getRandomStudent() throws Exception {
       Student std = null; 
        try {
            std = StudentDAO.getRandomStudent();        
            
            if (std == null) {
                throw new Exception("추천하는 학생이 없어요ㅠㅠ");
            }
            return std;
        } catch (Exception e) {
            throw new Exception("학생 추천 중 오류 발생: " + e.getMessage());
        } 
    }
}
