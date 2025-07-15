package controller;

import java.util.ArrayList;

import model.Student;
import model.StudentDAO;
import view.FailView;
import view.MbtiView;

public class MbtiController {
	
	public static ArrayList<String> findMyFriend(Student currentUser) {
		
		ArrayList<String> sameMbti = new ArrayList<>();
		try {
			for(Student friend: StudentDAO.getStudents()) {
				if(currentUser.getMbti().equals(friend.getMbti()) && !currentUser.getName().equals( friend.getName()) ) {
					sameMbti.add(friend.getName());
				}
			}
			if(sameMbti.size() == 0) {
				FailView.print("같은 Mbti인 학생이 없습니다.");
			} else {
				MbtiView.print(sameMbti);
			}
		}catch(Exception e) {
			FailView.print(e.getMessage());
//			e.printStackTrace();
		}
		return sameMbti;
	}
}