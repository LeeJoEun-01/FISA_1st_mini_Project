package view;

import java.util.ArrayList;

import controller.StudyController;
import util.ConsoleScanner;

public class StudyView {
	
	public static void StudyNameInput() {
		System.out.println("하고 싶은 스터디를 입력하시오:");
		
		//스터디 입력
		String studyName = ConsoleScanner.SCANNER.nextLine();
		StudyController.searchStudy(studyName);
	}

	public static void print(String studyName, ArrayList<String> data) {
        System.out.println("===============================");
        System.out.println("📚 " + studyName + " 스터디 멤버 추천");
        System.out.println("===============================");
        
        for (int i = 0; i < data.size(); i++) {
            System.out.print(data.get(i));
            if (i != data.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println("\n===============================");
        System.out.println("🎉 스터디 멤버 추천이 완료되었습니다!");
	}

}
