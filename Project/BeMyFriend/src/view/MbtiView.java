package view;

import java.util.ArrayList;

import controller.MbtiController;
import model.Student;
import model.StudentDAO;

public class MbtiView {
	
	public static void mbtiFriends() throws Exception {
		
		Student currentUser = StudentDAO.getCurrentUser();
		
		ArrayList<String> sameMbtiUsers = MbtiController.findMyFriend(currentUser);
		
		try {
			System.out.println("🎉 아래 친구들이 나와 MBTI가 동일합니다!");
	        for (int i = 0; i < sameMbtiUsers.size(); i++) {
	        	if (i == sameMbtiUsers.size() - 1) {
	        		System.out.println(sameMbtiUsers.get(i));
	        	}
	        	else {
	        		System.out.print(sameMbtiUsers.get(i) + ", ");
	        	}
	        }
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}