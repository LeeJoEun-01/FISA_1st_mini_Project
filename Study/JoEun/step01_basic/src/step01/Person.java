/* 학습 내용
 * 1. 변수 선언 및 호출
 * 2. 메소드 구현 및 호출
 * 3. 로직
 * 	- 내 짝꿍 주요 키워드 - 데이터
 * 					  - "Big Eyes" 문자열
 *  - (기능) "누구야 널 보니 이 키워드(변수)가 떠올라"라는 메세지 출력
 */

package step01;

public class Person {

	public static void main(String[] args) {
		// 문자열 데이터
		// 변수 선언 및 초기화
		/* 파이썬과의 차이점
		 * -> 타입 제한이 없다.(js도)
		 * 
		 * RDBMS의 sql
		 * image varchar2 형식으로 선언
		 * image 컬럼에 저장 가능한 데이터는 문자열만 가능
		 */
		String image = "big eyes";
		System.out.println("유진님을 보니 이 "+image+"가 떠올라");
	}

}
