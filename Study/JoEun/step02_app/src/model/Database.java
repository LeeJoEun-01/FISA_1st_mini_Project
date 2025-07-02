/* 용도
 * - Person 데이터를 제공하는 Database 기능의 클래스
 * - Client가 요청전에 이미 데이터는 구축되어야 하는 상황
 * - 데이터 초기화 (db관점에선 insert)
 * - 모든 데이터 반환 (db 관점에선 select)
 */
package model;

import model.domain.Person; // 다른 패키지면 무조건 import

public class Database {
	private static Person p; // 실체화 되는 시점: 객체 생성 시점
	// 여기 static 키워드 없으면 안됨. 왜??
	// -> 밑에 static 선언부 안에서 p를 사용해야 되기 때문에 static이 없으면 객체가 없기 때문에
	
	// byte code가 메모리에 로딩될 때 읽혀지는 시점에 실행
	static {
		p = new Person("tester",11);
	}
	
	Person getPersons() {
		return p;
	}
}
