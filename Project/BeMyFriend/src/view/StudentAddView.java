package view;

import java.util.Arrays;
import util.ConsoleScanner;

import controller.MainController;
import model.Student;

public class StudentAddView {
    public static void inputNewStudent() {
        try {
            System.out.println("***************************************");
            System.out.println("*         👩‍🎓 학생 등록 👨‍🎓           *");
            System.out.println("***************************************");

            System.out.print("이름: ");
            String name = ConsoleScanner.SCANNER.nextLine();

            System.out.print("나이: ");
            int age = Integer.parseInt(ConsoleScanner.SCANNER.nextLine());

            System.out.print("MBTI: ");
            String mbti = ConsoleScanner.SCANNER.nextLine();

            System.out.print("싫어하는 것 (쉼표로 구분): ");
            String[] hates = ConsoleScanner.SCANNER.nextLine().split(",");

            System.out.print("좋아하는 것 (쉼표로 구분): ");
            String[] favorites = ConsoleScanner.SCANNER.nextLine().split(",");

            System.out.print("스터디 관심사 (쉼표로 구분): ");
            String[] study = ConsoleScanner.SCANNER.nextLine().split(",");

            System.out.print("희망 취업 분야 (쉼표로 구분): ");
            String[] jobs = ConsoleScanner.SCANNER.nextLine().split(",");

            System.out.print("좋아하는 음식 (쉼표로 구분): ");
            String[] food = ConsoleScanner.SCANNER.nextLine().split(",");

            Student newStudent = new Student(name, age, mbti, hates, favorites, study, jobs, food);
            MainController.addStudent(newStudent);

            System.out.println("✅ 학생이 성공적으로 등록되었습니다!");

        } catch (Exception e) {
            System.out.println("❌ 등록 중 오류가 발생했습니다: " + e.getMessage());
        }

        MenuView.displayMenu();
    }
}
