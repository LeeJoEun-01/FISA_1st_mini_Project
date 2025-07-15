/* 용도
 * - Person 데이터를 제공하는 Database 기능의 클래스
 * - client가 요청전에 이미 데이터는 구축되어야 하는 상황 
 * 	- 데이터 초기화 (db관점에선 insert) 
 * 	- 모든 데이터 반환(db 관점에선 select)
 */

package model;

import model.domain.Employee;

public class Database {
	
	private static Employee [] employees; 
	
	static {
		employees = new Employee[] {
				new Employee(1, "나사원", 10),
				new Employee(2, "신동엽", 20),
				new Employee(3, "유재석", 30),
		};
	}
	
	Employee [] getEmployees(){
		return employees;
	}
	
}
