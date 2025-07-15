//package view;
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import controller.FavFoodMatchController;
//import model.Student;
//
//public class FavFoodView {
//	public static void favFoodMatch() {
//		Scanner sc = new Scanner(System.in);
//		
//		try {
//	
//	        System.out.println("***************************************");
//	        System.out.println("*        🍽️ 최애 음식 매칭 🍽️         *");
//	        System.out.println("***************************************");
//	        System.out.println();
//	        System.out.print("찾고 싶은 음식 이름을 입력하세요: ");
//	
//	        String foodName = sc.nextLine();
//	        
//	        ArrayList<String> result = FavFoodMatchController.fintStudentsByFood(foodName);
//	        
//	        if (result.isEmpty()) {
//                System.out.println("😢 해당 음식을 좋아하는 친구가 없습니다.");
//            } else {
//                System.out.println("🎉 아래 친구들이 " + foodName + "을(를) 좋아합니다!");
//                for (int i = 0; i < result.size(); i++) {
//                	if (i == result.size() - 1) {
//                		System.out.println(result.get(i));
//                	}
//                	else {
//                		System.out.print(result.get(i) + ", ");
//                		
//                	}
//                }
//            }
//	        
//		} catch(Exception e) {
//			System.out.println(e);
//		}
//	}
//    
//}
