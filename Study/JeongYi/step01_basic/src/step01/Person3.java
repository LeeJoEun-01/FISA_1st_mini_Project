package step01;

public class Person3 {

	int a = 3;
	void m1() {
		System.out.println("m1()");
	}
	public static void main(String[] args) {
		//p1 객체 관리변수(참조변수)
		Person3 p1 = new Person3();//주소값 다름
		Person3 p2 = new Person3();//서로 다른 주소값을 가짐
		
		System.out.println(p1.a);
		//? m1()호출하기
		p1.m1();
		
		//객체 주소값 비교
		System.out.println(p1 == p2); //false
	}

}
