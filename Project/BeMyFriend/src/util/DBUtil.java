package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.io.FileInputStream;

import java.util.Properties;

import java.sql.ResultSet;
import java.sql.Statement;

public class DBUtil {
	// key로  value값 활용시에만 사용하는 API
	private static Properties dbInfo = new Properties();
	
	private DBUtil() {}
	
	static {
		// 존재하는 파일로부터 자바 코드로 read하는 API
		try {
			dbInfo.load(new FileInputStream("dbinfo.properties"));
			Class.forName(dbInfo.getProperty("jdbc.driver"));
			
			System.out.println(dbInfo.getProperty("jdbc.id"));
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(dbInfo.getProperty("jdbc.url"),
				dbInfo.getProperty("jdbc.id"),	
				dbInfo.getProperty("jdbc.pw"));
	}
	
	// 자원 반환 필수(query)
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();
				rs = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// 자원 반환 필수(insert/update/delete)
	// close 메서드를 하나 더 만들어주는 이유는 rs를 null로 받으면
	// rs가 없는 부분에서 if문이 돌아야하기 때문에 효율성이 떨어진다!
	public static void close(Connection conn, Statement stmt) {
		try {
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println();
		
		try {
			System.out.println(getConnection());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
}
