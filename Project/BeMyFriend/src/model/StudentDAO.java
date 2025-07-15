package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBUtil;

public class StudentDAO {
	private static StudentDAO model = new StudentDAO();
	
	private StudentDAO() {} 
	
	public static StudentDAO getModel() {
		return model;
	}
	
	public static void getAllStudent() {
		// 로컬변수 기본 초기화 필수!
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		// driver 로딩 - 바이트코드 로딩
		try {
			conn = DBUtil.getConnection();

			stmt = conn.createStatement();
			System.out.println(stmt);

			rs = stmt.executeQuery("select * from student");
			while (rs.next()) { // next 통해서 다음열이 있는지 확인
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			DBUtil.close(conn, stmt, rs);
		}
	}
	
	public static ArrayList<String> sameMbtiSelectStudent(String mbti) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> all = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("select * from student where mbti=?");
			
			pstmt.setString(1, mbti);
			
			rs = pstmt.executeQuery();
			all = new ArrayList<>();
			
			while (rs.next()) {
				all.add(rs.getString("mbti"));
			}

		}finally{
			DBUtil.close(conn, pstmt, rs);
		}
		return all;
		
	}

	public static ArrayList<Student> getStudents() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<Student> all = null;
		// driver 로딩 - 바이트코드 로딩
		try {
			conn = DBUtil.getConnection();

			stmt = conn.createStatement();
			System.out.println(stmt);

			rs = stmt.executeQuery("select * from student");
			all = new ArrayList<>();
			while (rs.next()) { // next 통해서 다음열이 있는지 확인
				all.add(new Student (rs.getString("name"), 
									rs.getInt("age"),
									rs.getString("mbti"),
									rs.getString("hates").split(","),
									rs.getString("favorites").split(","),
									rs.getString("study").split(","),
									rs.getString("jobs").split(","),
									rs.getString("food").split(",")));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally { 
			DBUtil.close(conn, stmt, rs);
		}
		return all;
	}

}
