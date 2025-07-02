/* 학습 내용
 * 	1. 변수 선언 및 호출
 *  2. 메소드 구현 및 구현
 *  3. 로직
 * 내짝꿍 주요 키워드 - 데이터
 * 					""
 * "누구야 널 보니 이 키워드(변수)가 떠올라"라는 메세지 출력 - 기능
 * 		
 * */

package step01;

public class Person {

	public static void main(String[] args) { //시자을 위한 특별한 메소드
		//문자열 데이터
		//변수 선언 및 초기화(값 대입)
		
		/*파이썬과 차이점 (타입 제한이 x)
		 * image = "댄디"
		 * 
		 * js(java Script) 과의 차이점
		 * 타입 제시가 없다. 타입 제한이 없다.
		 * image = "댄디";
		 * image = 3 OK
		 * 
		 * RDBMS 의 sql
		 * image varchar2 형식으로 선언
		 * image 컬럼에 저장 가능한 데이터는 문자열만 가능 
		 * */
		String image = "댄디";
		//image변수 사용해서 시스템 콘솔창에 출력
		/*+ :앞뒤데이터 결합 연산자
		 * println(): 출력기능의 메소드
		 * system.out.: 프로그램이 실행되는 시스템의 콘솔창 의미
		 * JDK 내부에 내장된 library(api) 호출
		 * 
		 * String : 이미 문자열을 표현 내장 타입 library로 제공
		 * image: 개발자가 만든 변수
		 * */
		
		System.out.println("제현님을 보니 " + image + "가 떠올라요");
	}

}
