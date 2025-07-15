package view;

import java.util.ArrayList;

import controller.FavFoodMatchController;
import util.ConsoleScanner;

public class FavFoodView {
    public static void favFoodMatch() {
        System.out.println("***************************************");
        System.out.println("*        🍽️ 최애 음식 매칭 🍽️         *");
        System.out.println("***************************************");
        System.out.println();
        System.out.print("찾고 싶은 음식 이름을 입력하세요: ");

        String foodName = ConsoleScanner.SCANNER.nextLine();

        try {
            ArrayList<String> result = FavFoodMatchController.findStudentsByFood(foodName);

            if (result.isEmpty()) {
                System.out.println("😢 해당 음식을 좋아하는 친구가 없어요. 함께 먹자고 권유해볼까요?");
            } else {
                System.out.println("🎉 아래 친구들이 " + foodName + "을(를) 좋아합니다!");
                for (int i = 0; i < result.size(); i++) {
                    if (i == result.size() - 1) {
                        System.out.println(result.get(i));
                    } else {
                        System.out.print(result.get(i) + ", ");
                    }
                }
            }

        } catch (Exception e) {
            // 혹시 DB 오류 등 예상 못한 예외 처리
            System.out.println("[오류] " + e.getMessage());
        }

        // 결과 출력 후 메뉴로 복귀
        MenuView.displayMenu();
    }
}