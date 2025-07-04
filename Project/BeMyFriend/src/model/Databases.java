package model;

public class Databases {
	private static Student [] students;
	
	static {
		// 학생들 DB
		students = new Student[] {};
	}
	
	Student [] getStudents() {
		return students;
	}
}
