/*
* 1. 타입
*
* 1. 기본타입(8가지), 참조타입(non-기본)
* 2. 변수에 타입 반영
*     - 선언 위치
*      - 로컬 변수
*            : 생성자와 메소드() 또는 { } 내부에 선언
*              사용시점 - 호출되었을 경우에만 사용
*                                 생성자, 메소드 종료시 자동 소멸
*                                 임시변수
*        - 멤버
*            : class { } 내부에 선언
*              new와 생성자 조합으로 생성되는 객체의 데이터 실체 구성요소
*             사용 시점 : 객체가 존재하는 경우만 사용 가능
 */


package step02;

// 사용자 정의 클래스 - 참조타입의 근본
class Person {
	String name;
	int age;
	
	// age 값 수정하는 메소드
	/* 새로운 데이터 필요로 함
	 * 기능 - 새로운 데이터를 기존 데이터 값 삭제하고 대체
	 * 데이터를 관리하는 변수 - age
	 * 데이터 주고 받는 구조사에선 메모리, 메모리 관리하는 변수명
	 */
	void setAge(int age) { //매개변수 - 로컬 변수
		String name; // 타입이 있으면? -> 선언, 로컬변수
		this.age = age; // 이미 선언된 변수들 호출
	} //} 실행시 로컬 변수인 age와 name 변수 소멸
}

public class TypeLab {
	// Person에 이름값과 나이값을 메모리에 실제 사용 가능하게 실체화
	public static void main(String[] args) {
		// 객체 생성 - 사용자 정의 타입, 관리용 변수
		Person p1 = new Person(); // name, age 변수 공간이 실행환경 메모리에 생성
		System.out.println(p1);
		
		p1.name = "joeun";
		System.out.println(p1.name);
		
		p1.age = 10;
		System.out.println(p1.age);
		
		p1.setAge(100);
		System.out.println(p1.age);
	}
		
}
