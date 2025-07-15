package controller;

import java.util.ArrayList;

import model.Student;
import model.StudentDAO;

public class MbtiController {
	
	public static ArrayList<String> findMyFriend(Student currentUser) throws Exception {
		
		ArrayList<String> sameMbti = new ArrayList<>();
		
		for(Student friend: StudentDAO.getStudents()) {
			if(currentUser.getMbti().equals(friend.getMbti()) && currentUser.getName() != friend.getName() ) {
					sameMbti.add(friend.getName());

			}
		}
		
		if (sameMbti == null) {
			throw new Exception("같은 MBTI인 친구가 없어요ㅠㅠ");
		}
		
		return sameMbti;
	}

}
