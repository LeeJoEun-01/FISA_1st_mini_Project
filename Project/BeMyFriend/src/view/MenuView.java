package view;

import model.StudentDAO;
import util.ConsoleScanner;
import model.Student;

public class MenuView {
	public static void displayMenu() {
		// 현재 사용자 이름 가져와서 인사
		Student currentUser = StudentDAO.getCurrentUser();
		
		while(true) {
			System.out.println();
			System.out.println(currentUser.getName() + "님 안녕하세요!");
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println();
		    System.out.println("╔══════════════════════════════╗");
		    System.out.println("║   💌 친해지길 바라 - 메인 메뉴 💌   ║");
		    System.out.println("╠══════════════════════════════╣");
		    System.out.println("║ 1. 오늘의 친구 추천               ║");
		    System.out.println("║ 2. 오늘의 궁합 보기               ║");
		    System.out.println("║ 3. MBTI로 친구 찾기              ║");
		    System.out.println("║ 4. 나의 스터디 매칭               ║");
		    System.out.println("║ 5. 최애 음식 매칭                ║");
		    System.out.println("║ 6. 학생 정보 추가                ║");
		    System.out.println("║ 7. 학생 정보 수정                ║");
		    System.out.println("║ 8. 학생 정보 삭제                ║");
		    System.out.println("║ 9. 종료                       ║");
		    System.out.println("╚══════════════════════════════╝");
		    System.out.println();
		    System.out.print("메뉴 번호를 선택해주세요 (1~6): ");
			int input = ConsoleScanner.SCANNER.nextInt();
			ConsoleScanner.SCANNER.nextLine();
		    
		    // 입력한 수에 따른 분기
		    switch(input) {
		        case 1:
//	        	RecommandView.show(currentUser);
		        	break;
		        case 2:
		        	MatchView.inputFriendNameView();
		        	break;
		        case 3:
//	        	MbtiView.mbtiFriends();
		        	break;
		        case 4:
			        StudyView.StudyNameInput();
			        break;
		        case 5:
		        	FavFoodView.favFoodMatch();
		        	break;
		        case 6:
		        	StudentAddView.inputNewStudent();
		        	break;
		        case 7:
		        	StudentUpdateView.updateCurrentUser();
		        	break;
		        case 8:
		        	StudentDeleteView.deleteCurrentUser();
		        	break;
		        case 9:
		        	System.out.println("프로그램을 종료합니다. 안녕히 가세요!");
		        	return;
		        default:
		        	System.out.println("⚠️ 올바른 메뉴 번호를 입력해주세요.");
			    }
		    System.out.println();
		}
	}
}