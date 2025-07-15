package view;

import java.util.ArrayList;

import controller.MbtiController;
import model.Student;
import model.StudentDAO;

public class MbtiView {
	
	public static void mbtiFriends() {
		
		Student currentUser = StudentDAO.getCurrentUser();
		MbtiController.findMyFriend(currentUser);
			
			
	}
	public static void print(ArrayList<String> sameMbtiUsers) {
		
		System.out.println("🎉 아래 친구들이 나와 MBTI가 동일합니다!");
		for (int i = 0; i < sameMbtiUsers.size(); i++) {
			if (i == sameMbtiUsers.size() - 1) {
				System.out.println(sameMbtiUsers.get(i));
			}
			else {
				System.out.print(sameMbtiUsers.get(i) + ", ");
			}
		}
		
	}
}