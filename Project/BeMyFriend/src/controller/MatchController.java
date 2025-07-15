package controller;

import model.Student;
import model.StudentDAO;

public class MatchController {

    public static String handleCompatibility(String friendName) {
        try {
            double score = StudentDAO.calCompatibility(friendName);
            if (score == 0.0) {
                return "궁합을 계산할 수 없습니다.";
            }

            Student me = StudentDAO.getCurrentUser();
            StringBuilder sb = new StringBuilder();
            sb.append("\n");
            sb.append(String.format("%s님과 %s님의 궁합은 %.2f점입니다!\n", me.getName(), friendName, score));
            if (score >= 80) {
                sb.append("✨ 환상의 케미! 최고의 친구 ✨");
            } else if (score >= 60) {
                sb.append("😊 꽤 잘 맞는 친구예요!");
            } else if (score >= 40) {
                sb.append("🙂 보통의 궁합입니다.");
            } else {
                sb.append("😅 아직은 서먹한 사이일 수 있어요.");
            }
            return sb.toString();

        } catch (Exception e) {
            // 에러 메시지 넘겨주기
            return null;
        }
    }
}
