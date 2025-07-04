package view;

import java.util.ArrayList;

import controller.MbtiController;
import model.Model;
import model.Student;

public class MbtiView {
	
	public static void mbtiFriends() throws Exception {
		
		Student currentUser = Model.getCurrentUser();
		
		ArrayList<String> sameMbti = MbtiController.findMyFriend(currentUser);
		
		try {
			System.out.println("🎉 아래 친구들이 나와 MBTI가 동일합니다!");
	        for (int i = 0; i < sameMbti.size(); i++) {
	        	if (i == sameMbti.size() - 1) {
	        		System.out.println(sameMbti.get(i));
	        	}
	        	else {
	        		System.out.print(sameMbti.get(i) + ", ");
	        		
	        	}
	        }
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}



}
