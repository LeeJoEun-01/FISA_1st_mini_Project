/*
 * 1.static 키워드, 생성자 학습
 * 	- 변수
 * 	- static{}
 * 		: 단 한번 1회성으로 실행
 * 		: 공유하는 자원을 단 한번 초기화 하고자 할 경우 사용하는 구조의 코드
 * 		: 실행 시점
 * 			*.class 라는 실행 코드인 byte code가 메모리에
 * 			로딩 될 때 자동 실행
 * 2.생성자
 * 	1. 기능 - 객체 생성시 호출되는 유일한 요소
 * 	2. 예외 - String 타입은 "" 표기 만으로 자동 객체 생성
 * 			- new 생성자([..]) 조합으로 객체 생성
 * 
 *	3. 특징
 *		- 개발자가 코드로 미 개발시 기본 생성자만 자동 생성(컴파일 시점)
 *			: 기본생성자란?
 *				argument가 없는 생성자 의미
 *		- 하나의 클래스에는 () 즉 argument, parameter, 매개변수, 인수 ..
 *			다른 생성자를 여러개 개발 가능(다중 정의, overloading)
 *	4. 문법
 *		1. 클래스명과 동일
 *		2. ([arguments]){[..]}
 *	5. class 내부의 요소
 *		- 멤버변수, 생성자, 메소드, static{}
 *
 *
 * */

//package step02;
//
//public class StaticKeywordLab {
//	//멤버 변수는 실체화 되었을 때 기본값으로 초기화
//	//static 변수는 생성되는 모든 객체가 공유,
//	//저장 위치 bytecode 저장되는 class영역이라는 메모리에 저장
//	static int no1;	//0값으로 자동 초기화(메모리에 생성되는 값)
//	int no2;
//	
//	public StaticKeywordLab() {
//		no1 += 1; //0->1->2->3
//		no2 = no2+1; //객체 생성시 새로운 메모리로 생성
//	}
//	public static void main(String[] args) {
//		System.out.println(no1);
//		System.out.println(no1);
//		
//		
//	}
//
//}

package step02;

public class StaticKeywordLab {
	//멤버 변수만 실체화 되었을때 기본값으로 초기화
	static int no1;  //0값으로 자동 초기화(메모리에 생성되는 값)
	int no2;
	
	StaticKeywordLab(){
		no1 += 1; 
		no2 = no2+1;
	}
	static {
		System.out.println("class 3");
	}
	static {
		System.out.println("class 1");
	}
	
	public static void main(String[] args) {
//		System.out.println(no1);
//		System.out.println(StaticKeywordLab.no1); //0
//		
//		StaticKeywordLab s = new StaticKeywordLab();
//		System.out.println(s.no2); //1
//		
//		StaticKeywordLab s2 = new StaticKeywordLab();
//		System.out.println(s2.no2); //1
//		
//		System.out.println(no1); //2
//		System.out.println(StaticKeywordLab.no1); //2
//		
	}
	static {
		System.out.println("class 2");
	}
}
