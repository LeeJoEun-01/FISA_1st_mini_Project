/*용도
 * 
 * - Person 데이터를 제공하는 Database 기능의 클래스 
 * - client가 용청전에 이미 데이터는 구축되어야 하는 상황'
 * - 데이터 초기화 (db 관점에선 insert)
 * - 모든 데이터 반환 (db 관점에선 select)
 * 
 * */

package model;

import model.domain.Person;

public class Database {
	private static Person p; //실체화되는 시점: 객체 생성시점인데 
	
	//byte code가 메모리에 로딩될때 읽혀지는 시점에 실행이 되어서 
	static {
		p = new Person("tester", 11);
	}
	
	Person getPersons(){
		return p;
	}
	
	
}
