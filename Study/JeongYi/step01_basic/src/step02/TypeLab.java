/*학습내용
 * 1. 타입
 * 	1.기본타입(8가지) ,참조타입(non)
 * 	2. 변수에 타입 반영
 * 		- 선언 위치
 * 			1. 로컬 변수
 * 				생성자와 메소드 () 또는 {} 내부에 선언
 * 				사용시: 호출되었을 경우에만 사용
 * 					  생성자, 메소드 종료시 자동 소멸
 * 					  임시변수
 * 			2. 멤버 변수
 * 				class{} 내부에 선언
 * 				new와 생성자 조합으로 생성되는 객체의 데이터 실체 구성요소
 * 				사용 시점: 객체가 존재하는 경우만 사용가능
 * 				멤버변수 지점 키워드 this
 * 
 * 2. 리뷰
 * 	- class 구성 요소
 * 		멤버변수 생성자, 메소드, static{}
 * 		 
 * 
 * */


package step02;

//사용자 정의 클래스 - 참조타입의 근본

class Person{
	String name; 
	int age;//멤버 변수
	
	//age값 수정하는 메소드 
	
	/*새로운 데아터 필요로 함
	 * 기능 - 새로운 데이터를 가진 데이터값 삭제하고 대체
	 * 데이터를 관리하는 변수 - age
	 * 데이터를 주고 받는 구조 상에선 메모리, 메모리 관리하는 변수명
	 * 
	 * */
	//p1.setAge(100)
	void setAge(int age) {//로컬 변수
		String name; //선언, 로컬변수
		this.age = age; //멤버변수에 로컬변수 대입
	}//실행시 로컬 변수인 age 와 name 변수 소멸
	
}


public class TypeLab {
	//Person에 이름값과 나이값을 메모리에 실제 사용 가능하게 실체화
	public static void main(String[] args) {
		//객체 생성 - 사용자 정의 타입, 관리용 변수
		Person p1 = new Person(); //사용자 정의 타입 만들기 name, age 변수공간이 실행환경 메모리에 생성
		System.out.println(p1);
		p1.name = "장송하"; //Person 객체 내부의 name 메모리에 이름 저장
		System.out.println(p1.name);
		
		//age변수에 10 저장 출력
		p1.age = 10;
		System.out.println(p1.age);
		
		//메소드 age값 수정
		/*메소드 호출, 호출시에 새로운 데이터 (int) 반영
		 * () : 필요성 , 새로운 데이터값을 메소드 {}에 적용하는 관문
		 * 		매개변수, argument,parameter, 인수인자
		 * void setAge(){
		 * 
		 * }
		 * */
		
		p1.setAge(100);
		System.out.println(p1.age);
		

			
		
	}

}
