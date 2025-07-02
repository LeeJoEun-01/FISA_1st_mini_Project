package step02;

import lombok.Getter;
import lombok.Setter;

// lombok으로 만들기
@Getter
@Setter
class Person2 {
	String name;
	int age;
	
//	public String getName() { 
//		//getter - getname() 이거는 불가!, 왜? 추후 jsp tag가 자동 호출하는 메서드
//		return name;
//	}
//	public void setName(String name) { //setter
//		this.name = name;
//	}
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	
}

public class MethodLab2 {
	//
	static Person2 getPerson2() {
		return new Person2();
	}
	
	static void setPerson2(Person2 p) {
		p.name = "joeun";
		System.out.println(p.name);
	}
	
	
	public static void main(String[] args) {
		Person2 pp = MethodLab2.getPerson2();
		MethodLab2.setPerson2(pp);
		
		Person2 ppp = new Person2();
		MethodLab2.setPerson2(ppp);
		ppp.name = "ppp";
		System.out.println(ppp.name);
		
	}

}
