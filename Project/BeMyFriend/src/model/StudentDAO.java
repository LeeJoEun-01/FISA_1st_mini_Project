package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

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

}
