package view;

import controller.MatchController;
import util.ConsoleScanner;

public class MatchView {
	public static void inputFriendNameView() {
	    System.out.println();
	    System.out.print("궁합을 보고 싶은 친구의 이름을 입력하세요: ");
	    String friendName = ConsoleScanner.SCANNER.nextLine();

	    String resultMessage = MatchController.handleCompatibility(friendName);
	    
	    if (resultMessage != null) {
	        System.out.println(resultMessage);
	        try {
				MenuView.displayMenu();
			} catch (Exception e) {
				e.printStackTrace();
				StartView.viewStart();
			}
	    }
	}

}

