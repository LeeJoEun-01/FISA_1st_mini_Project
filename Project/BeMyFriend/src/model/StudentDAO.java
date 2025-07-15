package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Random;

import util.DBUtil;

public class StudentDAO {
	private static StudentDAO model = new StudentDAO();
	
	private static Student currentUser;  // 현재 로그인한 사용자
	
	private StudentDAO() {} 
	
	public static StudentDAO getModel() {
		return model;
	}
	
	public static Student getCurrentUser() {
		return currentUser;
	}
	
	public static void setCurrentUser(Student student) {
        currentUser = student;
    }
	
	public static Student findStudentByName(String name) throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        Student student = null;

        try {
            conn = DBUtil.getConnection();
            pstmt = conn.prepareStatement(
                "SELECT name, age, mbti, hates, favorites, study, jobs, food FROM student WHERE name = ?"
            );
            pstmt.setString(1, name);

            rs = pstmt.executeQuery();

            if (rs.next()) {
                student = new Student(
                    rs.getString("name"),
                    rs.getInt("age"),
                    rs.getString("mbti"),
                    rs.getString("hates").split(","),
                    rs.getString("favorites").split(","),
                    rs.getString("study").split(","),
                    rs.getString("jobs").split(","),
                    rs.getString("food").split(",")
                );
            }
        } finally {
            DBUtil.close(conn, pstmt, rs);
        }

        return student;
    }
	
	public static ArrayList<String> getAllStudent() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<String> all = null;
		try {
			conn = DBUtil.getConnection();
			stmt = conn.createStatement();
			rs = stmt.executeQuery("select * from student");
			
			all = new ArrayList<>(); //10개의 메모리 증가하는 동적 메모리 생성
			while(rs.next()) {
				all.add(rs.getString("name"));
			}
			return all;
		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			DBUtil.close(conn, stmt, rs);
		}
		return null;
	}
	
	public static ArrayList<String> getStudyWithMe(String study) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> all = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT name FROM student WHERE DBMS_LOB.INSTR(study, ?) > 0");
			pstmt.setString(1, study); //첫번째 물음표에 deptno값 대입 의미
			rs = pstmt.executeQuery(); // 실제 db에 select 수행
						
			all = new ArrayList<>(); //10개의 메모리 증가하는 동적 메모리 생성
			while(rs.next()) {
				all.add(rs.getString("name"));
			}
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		
		return all;
	}
	
	public static double calCompatibility(String friendName) throws Exception {
		Student me = StudentDAO.getCurrentUser();
	    double score = 0.0;

	    if (me == null) {
	        throw new Exception("현재 사용자를 알 수 없습니다. 재실행(ctrl + F11) 해주세요.");
	    }

	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    try {
	        conn = DBUtil.getConnection();
	        pstmt = conn.prepareStatement(
	            "SELECT name, age, mbti, hates, favorites, study, jobs, food FROM student WHERE name = ?"
	        );
	        pstmt.setString(1, friendName);
	        rs = pstmt.executeQuery();

	        if (!rs.next()) {
	            throw new Exception("해당 이름의 친구를 DB에서 찾을 수 없습니다.");
	        }

	        Student friend = new Student(
	                rs.getString("name"),
	                rs.getInt("age"),
	                rs.getString("mbti"),
	                rs.getString("hates").split(","),
	                rs.getString("favorites").split(","),
	                rs.getString("study").split(","),
	                rs.getString("jobs").split(","),
	                rs.getString("food").split(",")
	            );

	        Random rand = new Random();
	        score += rand.nextInt(50) + 1;

	        // MBTI 점수
	        int mbtiSameCount = 0;
	        for (int i = 0; i < 4; i++) {
	            if (me.getMbti().charAt(i) == friend.getMbti().charAt(i)) {
	                mbtiSameCount++;
	            }
	        }
	        score += mbtiSameCount * 5;

	        // 좋아하는 것 점수
	        int favCommon = 0;
	        for (String myFav : me.getFavorites()) {
	            for (String friendFav : friend.getFavorites()) {
	                if (myFav.trim().equals(friendFav.trim())) {
	                    favCommon++;
	                }
	            }
	        }
	        int favTotal = me.getFavorites().size() + friend.getFavorites().size();
	        double favPercent = ((double) favCommon / favTotal) * 10;
	        score += favPercent;

	        // 싫어하는 것 점수
	        int hateCommon = 0;
	        for (String myHate : me.getHates()) {
	            for (String friendHate : friend.getHates()) {
	                if (myHate.trim().equals(friendHate.trim())) {
	                    hateCommon++;
	                }
	            }
	        }
	        int hateTotal = me.getHates().size() + friend.getHates().size();
	        double hatePercent = ((double) hateCommon / hateTotal) * 10;
	        score += hatePercent;

	        // 좋아하는 음식 점수
	        int favFood = 0;
	        for (String myFood : me.getFood()) {
	            for (String friendFood : friend.getFood()) {
	                if (myFood.trim().equals(friendFood.trim())) {
	                    favFood++;
	                }
	            }
	        }
	        int foodTotal = me.getFood().size() + friend.getFood().size();
	        double foodPercent = ((double) favFood / foodTotal) * 10;
	        score += foodPercent;

	    } finally {
	        DBUtil.close(conn, pstmt, rs);
	    }

	    return score;
	}

	 public static Student getRandomStudent() throws Exception {
	    	Connection conn = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			Student friend = null;
			
	        try {
	        		conn = DBUtil.getConnection();
	        		pstmt = conn.prepareStatement("SELECT stdno, name, age, mbti, hates, favorites, study, jobs, food FROM (SELECT * FROM student ORDER BY DBMS_RANDOM.VALUE ) WHERE ROWNUM = 1 ");
	     	        rs = pstmt.executeQuery();

	            if (rs.next()) {
	            	 friend = new Student(
	    	                rs.getString("name"),
	    	                rs.getInt("age"),
	    	                rs.getString("mbti"),
	    	                rs.getString("hates").split(","),
	    	                rs.getString("favorites").split(","),
	    	                rs.getString("study").split(","),
	    	                rs.getString("jobs").split(","),
	    	                rs.getString("food").split(",")
	    	            );
	            } else {
	                throw new Exception("추천할 학생이 없어요 ㅠㅠ");
	            }

	        } catch (SQLException e) {
	            throw new Exception("DB 오류: " + e.getMessage());
	        }
			return friend;
	    }

	
	public static ArrayList<String> findStudentsByFood(String foodName) throws Exception {
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    ResultSet rs = null;

	    ArrayList<String> matched = new ArrayList<>();
	    try {
	        conn = DBUtil.getConnection();
	        pstmt = conn.prepareStatement(
	            "SELECT name FROM student WHERE ',' || food || ',' LIKE '%,' || ? || ',%'"
	        );
	        pstmt.setString(1, foodName);

	        rs = pstmt.executeQuery();
	        while (rs.next()) {
	            matched.add(rs.getString("name"));
	        }
	    } finally {
	        DBUtil.close(conn, pstmt, rs);
	    }

	    return matched;
	}

	public static void insertStudent(Student student) throws Exception {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DBUtil.getConnection();
	        pstmt = conn.prepareStatement(
	            "INSERT INTO student (name, age, mbti, hates, favorites, study, jobs, food) VALUES (?, ?, ?, ?, ?, ?, ?, ?)"
	        );
	        pstmt.setString(1, student.getName());
	        pstmt.setInt(2, student.getAge());
	        pstmt.setString(3, student.getMbti());
	        pstmt.setString(4, String.join(",", student.getHates()));
	        pstmt.setString(5, String.join(",", student.getFavorites()));
	        pstmt.setString(6, String.join(",", student.getStudy()));
	        pstmt.setString(7, String.join(",", student.getJobs()));
	        pstmt.setString(8, String.join(",", student.getFood()));

	        pstmt.executeUpdate();
	    } finally {
	        DBUtil.close(conn, pstmt);
	    }
	}

	public static void updateStudent(Student student) throws Exception {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DBUtil.getConnection();
	        pstmt = conn.prepareStatement(
	            "UPDATE student SET age=?, mbti=?, hates=?, favorites=?, study=?, jobs=?, food=? WHERE name=?"
	        );
	        pstmt.setInt(1, student.getAge());
	        pstmt.setString(2, student.getMbti());
	        pstmt.setString(3, String.join(",", student.getHates()));
	        pstmt.setString(4, String.join(",", student.getFavorites()));
	        pstmt.setString(5, String.join(",", student.getStudy()));
	        pstmt.setString(6, String.join(",", student.getJobs()));
	        pstmt.setString(7, String.join(",", student.getFood()));
	        pstmt.setString(8, student.getName());

	        pstmt.executeUpdate();
	    } finally {
	        DBUtil.close(conn, pstmt);
	    }
	}
	
	public static void deleteStudent(String name) throws Exception {
	    Connection conn = null;
	    PreparedStatement pstmt = null;

	    try {
	        conn = DBUtil.getConnection();
	        pstmt = conn.prepareStatement("DELETE FROM student WHERE name = ?");
	        pstmt.setString(1, name);
	        int result = pstmt.executeUpdate();

	        if (result == 0) {
	            throw new Exception("삭제할 학생을 찾을 수 없습니다.");
	        }
	    } finally {
	        DBUtil.close(conn, pstmt);
	    }
	}

}
	

