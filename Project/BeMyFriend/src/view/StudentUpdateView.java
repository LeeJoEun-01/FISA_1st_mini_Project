package view;

import util.ConsoleScanner;
import controller.MainController;
import model.Student;
import model.StudentDAO;

public class StudentUpdateView {
    public static void updateCurrentUser() {
        try {
            Student current = StudentDAO.getCurrentUser();

            System.out.println("***************************************");
            System.out.println("*          ✏️ 학생 정보 수정 ✏️        *");
            System.out.println("***************************************");

            System.out.printf("현재 이름: %s (변경 불가)\n", current.getName());

            System.out.printf("현재 나이: %d\n새 나이 (Enter로 유지): ", current.getAge());
            String ageInput = ConsoleScanner.SCANNER.nextLine();
            int age = ageInput.isEmpty() ? current.getAge() : Integer.parseInt(ageInput);

            System.out.printf("현재 MBTI: %s\n새 MBTI (Enter로 유지): ", current.getMbti());
            String mbtiInput = ConsoleScanner.SCANNER.nextLine();
            String mbti = mbtiInput.isEmpty() ? current.getMbti() : mbtiInput;

            System.out.printf("현재 싫어하는 것: %s\n새 값 (쉼표로 구분, Enter로 유지): ", String.join(",", current.getHates()));
            String hatesInput = ConsoleScanner.SCANNER.nextLine();
            String[] hates = hatesInput.isEmpty() ? current.getHates().toArray(new String[0]) : hatesInput.split(",");

            System.out.printf("현재 좋아하는 것: %s\n새 값 (쉼표로 구분, Enter로 유지): ", String.join(",", current.getFavorites()));
            String favInput = ConsoleScanner.SCANNER.nextLine();
            String[] favorites = favInput.isEmpty() ? current.getFavorites().toArray(new String[0]) : favInput.split(",");

            System.out.printf("현재 스터디: %s\n새 값 (쉼표로 구분, Enter로 유지): ", String.join(",", current.getStudy()));
            String studyInput = ConsoleScanner.SCANNER.nextLine();
            String[] study = studyInput.isEmpty() ? current.getStudy().toArray(new String[0]) : studyInput.split(",");

            System.out.printf("현재 희망 직업: %s\n새 값 (쉼표로 구분, Enter로 유지): ", String.join(",", current.getJobs()));
            String jobsInput = ConsoleScanner.SCANNER.nextLine();
            String[] jobs = jobsInput.isEmpty() ? current.getJobs().toArray(new String[0]) : jobsInput.split(",");

            System.out.printf("현재 좋아하는 음식: %s\n새 값 (쉼표로 구분, Enter로 유지): ", String.join(",", current.getFood()));
            String foodInput = ConsoleScanner.SCANNER.nextLine();
            String[] food = foodInput.isEmpty() ? current.getFood().toArray(new String[0]) : foodInput.split(",");

            Student updated = new Student(
                    current.getName(),
                    age,
                    mbti,
                    hates,
                    favorites,
                    study,
                    jobs,
                    food
            );

            MainController.updateStudent(updated);

            System.out.println("✅ 정보가 성공적으로 수정되었습니다!");

        } catch (Exception e) {
            System.out.println("❌ 수정 중 오류가 발생했습니다: " + e.getMessage());
        }

        MenuView.displayMenu();
    }
}
