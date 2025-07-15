//package controller;
//
//import model.Model;
//import model.Student;
//import view.RecommandView;
//
//import java.util.List;
//import java.util.Random;
//
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
//
