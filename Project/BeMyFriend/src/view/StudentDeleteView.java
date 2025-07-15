package view;

import util.ConsoleScanner;
import controller.MainController;
import model.Student;
import model.StudentDAO;

public class StudentDeleteView {
    public static void deleteCurrentUser() {
        Student current = StudentDAO.getCurrentUser();
        if (current == null) {
            System.out.println("❌ 현재 로그인한 사용자가 없습니다.");
            MenuView.displayMenu();
            return;
        }

        System.out.println("***************************************");
        System.out.println("*          🗑️ 학생 정보 삭제 🗑️        *");
        System.out.println("***************************************");
        System.out.printf("정말로 %s님의 정보를 삭제하시겠습니까? (Y/N): ", current.getName());

        String confirm = ConsoleScanner.SCANNER.nextLine();

        if (confirm.equalsIgnoreCase("Y")) {
            try {
                MainController.deleteCurrentUser();
                System.out.println("✅ 정보가 삭제되었습니다. 프로그램을 종료합니다.");
                System.exit(0);
            } catch (Exception e) {
                System.out.println("❌ 삭제 중 오류가 발생했습니다: " + e.getMessage());
                MenuView.displayMenu();
            }
        } else {
            System.out.println("삭제를 취소했습니다.");
            MenuView.displayMenu();
        }
    }
}
