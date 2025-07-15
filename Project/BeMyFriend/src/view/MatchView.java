package view;

import controller.MatchController;
import util.ConsoleScanner;

public class MatchView {
	public static void inputFriendNameView() {
	    System.out.println();
	    System.out.print("궁합을 보고 싶은 친구의 이름을 입력하세요: ");
	    String friendName = ConsoleScanner.SCANNER.nextLine();

	    String resultMessage = MatchController.handleCompatibility(friendName);
	    
        if (resultMessage == null) {
            System.out.println("해당 이름의 친구를 찾을 수 없습니다.");
            // MatchView 재호출 (다시 입력)
            inputFriendNameView();
        } else {
            // 성공 결과 출력
            System.out.println(resultMessage);
            // 메뉴로 돌아가기
            MenuView.displayMenu();
        }
	}

}

