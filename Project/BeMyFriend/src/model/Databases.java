package model;

public class Databases {
	// 현재 사용자 정보
	private static Student currentUser;
	
	// 현재 사용자 설정
	public static void setCurrentUser(Student user) {
		currentUser = user;
	}
	
	// 현재 사용자 가져오기
	public static Student getCurrentUser() {
		return currentUser;
	}
}
