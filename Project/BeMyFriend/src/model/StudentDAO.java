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
	
	public static String[] getStudyWithMe(String study) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> all = null;
		try {
			conn = DBUtil.getConnection();
			pstmt = conn.prepareStatement("SELECT name FROM student\r\n WHERE DBMS_LOB.INSTR(study, ?) > 0;");
			pstmt.setString(1, study); //첫번째 물음표에 deptno값 대입 의미
			rs = pstmt.executeQuery(); // 실제 db에 select 수행
						
			all = new ArrayList<>(); //10개의 메모리 증가하는 동적 메모리 생성
			while(rs.next()) {
				all.add(rs.getString("name"));
			}
		} finally {
			DBUtil.close(conn, pstmt, rs);
		}
		
		return null;
	}
}
