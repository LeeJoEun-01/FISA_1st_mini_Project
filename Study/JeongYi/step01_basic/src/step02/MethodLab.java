/*학습 내용 
 * 1. 메소드 구현 및 호출 문법 & static
 * 2. 기본 syntax
 * 		반환타입 메소드명([argument]){
 * 			[body]
 * 		}
 * 3. 메소드만의 주요 키워드
 * 	1. void - 메소드 선언구, 반환값이 없음을 의미
 * 	2. return - 메소드 {} 내부에서 사용, 호출한 곳으로 값 주겠다는 의미
 * 
 * 4.메소드 호출 방식
 * 	1. 객체 생성후 생성된 객체를 관리(참조)하는 변수로 호출
 * 	2. 객체 생성없이 class명, 메소드명 문법으로 호출
 * 		- 단 static 으로 선언된 메소드에 한해서만
 * 
 * 5. API doc 활용
 * 	-java.lang.Math 클래스의 모든 메소드가 static인 사유?
 * 	: 모든 메소드 기능이 늘 필요한가?
 * 	:랜덤 산출하는 메소드 기능만 필요한가?
 * 	:절대값? 최대값? 하는 메소드 기능들만 선별적으로 필요한가?
 * 	- 제시자 관점 재사용성 극대화, 시스템 성능 고려, 간편 호출 
 * 
 *  
 * */

package step02;

public class MethodLab {	
	
	//두개의 숫자(정수) 받아서 = 연산 후 출력
	static void add(int no1,int no2) { //static 변수없이도 메소드 가져올 수 있음
		
		System.out.println(no1 + no2);
	}
	
	public static void main(String[] args) {
		MethodLab m =new MethodLab(); //멤버변수가 없다면 객체 생성은 고민
		m.add(10, 20);
		
		MethodLab.add(20, 30);
		add(20, 30); //동일한 클래스 내의 메소드에 한해서만 ok
		
		//API 제공 메소드
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.max(10,11));
		
		String data = "fisa 5기";
		System.out.println(data.length());
		System.out.println(data.charAt(5));
		//d()호출 후에 반환받은 Person 객체의 name 와 age에 값 대입 및 출력
		
		Person p = d();
		System.out.println(p.name); //fisa맨
		p.name = "ce맨";
		p.age = 10;
		System.out.println(p.name);//ce맨
		p.name = "ai맨";
		System.out.println(p.name);//ai맨
		System.out.println(p.age);
		
		
		int ab = m.a();
		System.out.println(ab);
		
		String st = m.b();
		System.out.println(st);
	}
	static Person d() {
		Person p = new Person();
		p.name = "fisa맨";
		System.out.println(p.name);
		
		return p;
	}
	//int 값 반환 메소드 / String 반환 / 사용자 정의 반환(Person)
	int a() {
		return 3;
	}
	String b() {
		return "fisa";
	}
	void c() {
		//..
		return ;
	}
	
	

}
