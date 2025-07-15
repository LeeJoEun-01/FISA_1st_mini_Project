//package view;
//
//import java.lang.reflect.Array;
//
//import controller.RecommandController;
//import model.Student;
//
//public class RecommandView {
//
//    public static void show(Student data) {
//    	try {
//	        if (data instanceof Student) {
//	            Student student = RecommandController.getRandomStudent();
//	
//	            System.out.println("╔════════════════════════════════════╗");
//	            System.out.println("🌟            오늘의 친구 추천            🌟");
//	            System.out.println("╚════════════════════════════════════╝");
//	            System.out.println();
//	            System.out.println("💌 오늘은 " + student.getName() + " 님과 친해져 보세요!");
//	            System.out.println();
//	            System.out.println("👤 이름           : " + student.getName());
//	            System.out.println("🎂 나이           : " + student.getAge() + "세");
//	            System.out.println("🧠 MBTI          : " + student.getMbti());
//	            System.out.print("💔 싫어하는 것      : ");
//	            for(String h: student.getHates()) {
//	            	System.out.print(h+" ");
//	            }
//	            System.out.println();
//	            //+ Array.toString((Array)student.getHates()));
//	            System.out.print("💖 좋아하는 것      : ");
//	            for(String f: student.getFavorites()) {
//	            	System.out.print(f+" ");
//	            }
//	            System.out.println();
//	            System.out.print("📚 공부 분야       : ");
//	            for(String s: student.getStudy()) {
//	            	System.out.print(s+" ");
//	            }
//	            System.out.println();
//	            System.out.print("🍱 좋아하는 음식     : ");
//	            for(String fo: student.getFood()) {
//	            	System.out.print(fo+" ");
//	            }
//	            System.out.println();
//	            System.out.println("✨ 새로운 인연을 만들어보세요! ✨");
//	            System.out.println("────────────────────────────────────");
//	        }
//    	}catch(Exception e) {
//    		System.out.println(e);
//    	}
//    }
//
//}