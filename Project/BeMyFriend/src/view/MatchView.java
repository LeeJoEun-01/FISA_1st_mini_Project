package view;

import java.util.Scanner;

import controller.MatchController;
import model.Student;
import model.StudentDAO;

public class MatchView {
	public static void inputFriendNameView() {
	    try (Scanner sc = new Scanner(System.in)) {
	        Student me = StudentDAO.getCurrentUser();
	        System.out.println();
	        System.out.print("궁합을 보고 싶은 친구의 이름을 입력하세요: ");
	        String friendName = sc.nextLine();

	        try {
	            double score = MatchController.getCompatibility(friendName);

	            System.out.println();
	            System.out.printf("%s님과 %s님의 궁합은 %.2f점입니다!\n", me.getName(), friendName, score);
	            if (score >= 80) {
	                System.out.println("✨ 환상의 케미! 최고의 친구 ✨");
	            } else if (score >= 60) {
	                System.out.println("😊 꽤 잘 맞는 친구예요!");
	            } else if (score >= 40) {
	                System.out.println("🙂 보통의 궁합입니다.");
	            } else {
	                System.out.println("😅 아직은 서먹한 사이일 수 있어요.");
	            }

	        } catch (Exception e) {
	            System.out.println(e.getMessage());
	            inputFriendNameView();
	        }
	    }
	}

}
