/* 학습 내용
 * 1. 변수와 메소드 선언 및 구현을 main 메소드 외부에 개발
 * 	- 새로운 변수, 새로운 메서드
 * 2. main 메소드 내부에서 호출 및 실행
 * 3. main()
 *   - 서버가 없는 일반 자바 프로그램의 실행 시작 메소드
 */
package step01;

public class Person2 {
	// 변수 선언 및 초기화
	String image = "MEGA";
	
	// 사용자 정의 메소드
	// 기능: 변수값 포함한 메세지 출력 (S.o.p)
	// void -> 호출 받으면 일은 하고 호출한 곳으로 값 반환 안 함
	// 메소드 문법 - 리턴타입 메소드명(){}
	void printMessage() {
		System.out.println(image+"커피를 마시고 있다.");
	}
	public static void main(String[] args) {
		/* 객체 생성
		 * 1. class가 존재해야만 생성 가능한 문법
		 * 2. 생성의 주 목적
		 * 	- main메서드 이외에서 개발한 것들 호출
		 * 3. 실체화
		 * 4. 구조
		 * 	 - 객체라는 데이터를 생성
		 *   - 생성된 객체가 메모리에 저장된 위치값을 변수에 대입
		 *   - 객체를 관리하는 변수로 객체 내부의 내용물들(변수, 메서드) 호출
		 * 5. 문법
		 *   - new 생성자 조합으로 생성 
		 * 6. new Person2()
		 *   - 변수는 메모리에 실제 생성
		 *   - 메소드 호출 가능하게 하는 구성
		 * 7. p 변수가 보유한 것은?
		 */
		Person2 p = new Person2();
		p.printMessage();
		System.out.println(p); // p의 주소값: step01.Person2@3f99bd52
	}

}
