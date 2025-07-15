//package controller;
//
//import java.util.Random;
//
//import model.Model;
//import model.Student;
//
//public class MatchController {
//	
//	public static double calculateCompatibility(String friendName) throws Exception {
//		Student me = Model.getCurrentUser();
//		Student friend = null;
//		double score = 0.0;
//		
//		if (me == null) {
//			throw new Exception("현재 사용자를 알 수 없습니다. 재실행(ctrl + F11) 해주세요.");
//		}
//			
//		// friendName에 맞는 친구 찾기
//		for (Student s : Model.getModel().getStudents()) {
//			if (s.getName().equals(friendName)) {
//				friend = s;
//				break;
//			}
//		}
//			
//		// 친구 못 찾으면 예외처리
//		if (friend == null) {
//			throw new Exception("해당 이름의 친구를 찾을 수 없습니다.");
//		}
//		
//		// 랜덤 수 (1~50점)
//		Random rand = new Random();
//		score += rand.nextInt(50) + 1;
//		
//		// mbti 같은 알파벳 수 * 5 (20점 만점)
//		int mbtiSameCount = 0;
//		for (int i = 0; i < 4; i++) {
//			if(me.getMbti().charAt(i) == friend.getMbti().charAt(i)) {
//				mbtiSameCount ++;
//			}
//		}
//		score += mbtiSameCount * 5;
//		
//		// 겹치는 좋아하는 것 (10점 만점)
//		int favCommon = 0;
//		for (String myFav : me.getFavorites()) {
//			for (String friendFav : friend.getFavorites()) {
//				if (myFav.equals(friendFav)) {
//					favCommon ++;
//				}
//			}
//		}
//		int favTotal = me.getFavorites().size() + friend.getFavorites().size();
//		double favPercent = ((double) favCommon / favTotal) * 10;
//		score += favPercent;
//		
//		// 겹치는 싫어하는 것 (10점 만점)
//		int hateCommon = 0;
//		for (String myHate : me.getHates()) {
//			for (String friendHate : friend.getHates()) {
//				if (myHate.equals(friendHate)) {
//					hateCommon ++;
//				}
//			}
//		}
//		int hateTotal = me.getHates().size() + friend.getHates().size();
//		double hatePercent = ((double) hateCommon / hateTotal) * 10;
//		score += hatePercent;
//		
//		// 겹치는 최애 음식 (10점 만점)
//		int favFood = 0;
//		for (String myFood : me.getFood()) {
//			for (String friendFood : friend.getFood()) {
//				if (myFood.equals(friendFood)) {
//					favFood ++;
//				}
//			}
//		}
//		int foodTotal = me.getFood().size() + friend.getFood().size();
//		double foodPercent = ((double) favFood / foodTotal) * 10;
//		score += foodPercent;
//			
//		return score;
//	}
//}
