package model;

public class Databases {
<<<<<<< HEAD
	// 현재 사용자 정보
	private static Student currentUser;
	
	// 현재 사용자 설정
	public static void setCurrentUser(Student user) {
		currentUser = user;
	}
	
	// 현재 사용자 가져오기
	public static Student getCurrentUser() {
		return currentUser;
=======
	private static Student [] students;
	
	static {
		// 학생들 DB
		students = new Student[] {};
	}
	
	Student [] getStudents() {
		return students;
>>>>>>> 7d83d8c1347609bcd54ee3a82bf1499ef6dec131
	}
}
