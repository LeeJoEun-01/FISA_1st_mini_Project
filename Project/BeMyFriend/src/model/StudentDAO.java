package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import util.DBUtil;

public class StudentDAO {
	private static StudentDAO model = new StudentDAO();
	
	private StudentDAO() {} 
	
	public static StudentDAO getModel() {
		return model;
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

	public static void setCurrentUser(String found) {
		// TODO Auto-generated method stub
		
	}
}
