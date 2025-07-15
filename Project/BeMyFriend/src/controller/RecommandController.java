package controller;

import model.Student;
import model.StudentDAO;

public class RecommandController {

    public static Student getRandomStudent() throws Exception {
       Student std = null; 
        try {
            std = StudentDAO.getRandomStudent();        
            
            if (std == null) {
                throw new Exception("추천하는 학생이 없어요ㅠㅠ");
            }
        } catch (Exception e) {
            throw new Exception("학생 추천 중 오류 발생: " + e.getMessage());
        } 
        return std;
    }
}
