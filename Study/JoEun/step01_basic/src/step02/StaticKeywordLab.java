/* 학습내용
 * 1. static 키워드, 생성자 학습
 * 		- 변수
 * 		- static{}
 * 			: 단 한번 1회성으로 실행 
 * 			: 공유하는 자원을 단 한번 초기화 하고자 할 경우 사용하는 구조의 코드
 * 			: 실행 시점
 * 				*.class라는 실행 코드인 byte code가 메모리에 로딩될 때 자동 실행
 * 2. 생성자
 * 	a. 기능 - 객체 생성시 호출되는 유일한 요소
 *  b. 예외 - String 타입은 "" 표기 만으로 자동 객체 생성
 *  	   - new 생성자([..]) 조합으로 객체 생성
 * 3. 특징
 * 		- 개발자가 코드로 미 개발시 기본 생성자만 자동 생성(컴파일 시점)
 * 			: 기본 생성자란?
 * 				argument가 없는 생성자 의미💫
 * 		- 하나의 클래스에는 () 즉 argument, parameter, 매개변수, 인수..
 * 		  다른 생성자를 여러개 개발 가능 (다중 정의, overloading)
 * 4. 문법
 * 	a. 클래스명과 동일
 *  b. ([arguments]){[..]}
 *  
 * 5. class 내부의 요소
 * 	- 멤버변수, 생성자, 메소드, static{}
 */
package step02;

public class StaticKeywordLab {
	// int는 0으로 초기화, string은 null로 초기화 (멤버변수만! 로컬변수는 X)
	// static 변수는 생성되는 모든 객체가 공유
	// 저장 위치 bytecode 저장되는 class 영역이라는 메모리에 저장
	static int no1;
	int no2;
	
	StaticKeywordLab(){
		no1 += 1;
		no2 += 1;
	}
	
	static {
		System.out.println("class 1");
	}

	public static void main(String[] args) {
//		System.out.println(no1); //0
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
//		// 코드를 보고 static 변수에 대해서 추론 해보기
//		// no1은 static 변수임으r로 생성자가 동작하지 않고 바로 no1의 초기값을 가지고 온다.
//		// 하지만 no2는 StaticKeywordLab 객체가 생성될 때 생성자 함수가 동작하기 때문에 1이 된다.
	}
	
}
