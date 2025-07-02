/* 학습내용
 * 1. 메소드 구현 및 호출 문법 & static 키워드
 * 2. 기본 syntax
 * 		반환타입 메소드명([arguments]) {
 * 			[body]
 * 		}
 * 3. 메소드만의 주요 키워드
 * 		- void: 메소드 선언구, 반환값이 없음을 의미
 * 		- return: 메소드 {} 내부에서 사용, 호출한 곳으로 값 주겠다는 의미
 * 4. 메소드 호출 방식
 * 	a. 객체 생성후 생성된 객체를 관리(참조)하는 변수로 호출
 *  b. 객체 생성없이 class명. 메소드명 문법으로 호출
 *  	- 단, static으로 선언된 메소드에 한해서만
 *  
 *  5. API doc 활용
 *  - https://devdocs.io/openjdk~17/
 *  - java.lang.Math 클래스의 모든 메소드가 static인 이유?
 *  	: 모든 메소드 기능이 늘 필요한가?
 *  	: 특정 메소드 기능만 선별적으로 필요한가?
 *  	= 제시자 관점: 재사용성 극대화, 시스템 성능 고려, 간편 호출
 *  	  Math 객체 생성이 중요하지 않음
 *  	  필요한 메소드만 단순하게 호출 가능하게 제시
 * 
 * 6. 예시
 * 	- 호출자가 문자열을 주고 길이값 반환 기능 요청
 * 		제공 데이터 : 문자열
 * 		반환 데이터 : int
 * 		int length(String data){
 * 			data 변수의 문자열 길이 카운트해서 반환	
 * 		}
 * 		이 메소드를 보유한 String 클래스는 객체 생성 의미가 있다? 없다?
 * 		static int length(String data){
 * 			data 변수의 문자열 길이 카운트해서 반환	
 * 		}
 * 		int length = String.length("김혜경");
 * 
 * 	- 이미 존재하는 문자열 객체만의 길이값 반환
 * 		static int length(){
 * 			이 메소드를 보유한 객체의 길이 반환
 * 		}	
 * 		int length = String.length();  오류
 * 
 * - 이미 존재하는 문자열 객체만의 길이값 반환
 * 		int length(){
 * 			이 메소드를 보유한 객체의 길이 반환
 * 		}	
 * 		String data = "eeeee";
 * 		int length = data.length();  오류
 * 
 *  - 특정 index 값 제공하면서 이미 존재하는 문자열 객체의 두번째 한 글짜만 반환
 * 		? char charAt(int index){
 * 			return 문자 착출해서 반환
 * 		}
 * 		String 객체 생성 필수 따라서 static 선언 불가  
 */

package step02;

public class MethodLab {
	// 두개의 숫자 받아서 + 연산후 출력
	static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		// 멤버변수가 없다면 객체 생성은 고민해봐야 한다.
		MethodLab m = new MethodLab();
		m.add(10, 20);
		
		add(20,30); // 동일한 클래스 내의 메소드에 한해서만 OK
		// static으로 선언된 메서드는 객체가 생성되지 않아도 메서드 호출 가능
		// 근데 명시적으로 앞에 클래스를 붙여준다.
		MethodLab.add(10, 30);
		
		// API 제공 메소드
		System.out.println(Math.random());
		System.out.println(Math.random());
		
		String data = "fisa 5기";
		System.out.println(data.length());
		System.out.println(data.charAt(5));
		
		Person dd = MethodLab.d();
//		dd.age = 25;
//		dd.name = "joeun";
		System.out.println("나이는 "+dd.age+"이고, 이름은 "+dd.name+"입니다.");
	}
	
	static Person d() {
		return new Person();
	}

}
