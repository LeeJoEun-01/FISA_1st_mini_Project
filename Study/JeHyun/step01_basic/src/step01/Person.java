/*
 1. 변수 선언 및 호출
 2. 메소드 구현 및 호출
 3. 로직
 	- 내 짝궁 주요 키워드 - 데이터 
 					 = "담백함" 문자열
 	-"~~~야 널 보니 이 키워드(변수)가 떠올라" 라는 메세지 출력 - 가능
 */

package step01;

public class Person {

	public static void main(String[] args) { //시작을 위한 특별한 메소드
		// 문자열 데이터
		/*
		 파이썬과의 차이점 -> 타입 제한이 없음
		 ex) image = "담백함"; -> 문법 OK
		 js(Java Script)과의 차이점 -> 타입 제한이 없음
		
		 RDBMS 의 sql
		 image varchar2 형식으로 선언
		 image 컬럼에 저장 가능한 데이터는 문자열만 가능
		 
		 String : 이미 문자열을 표현한 내장 타입(library로 제공)
		 image : 개발자가 만든 변수명
		 */
		
		String image = "담백함";  //데이터(변수) 선언 및 초기화 = (값 대입)
		//image 변수 사용해서 시스템 콘솔에 출력
		//System out : 프로그램이 실행되는 시스템의 콘솔창 의미
		//JDK 내부에 내장된 library(api) 호출
		System.out.println("이정님을 보니 " + image + " 이 떠올라");
		
	}

}
