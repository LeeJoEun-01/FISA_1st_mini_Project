package step02;

//java.lang package만 제외하고는 모두다 import 필수
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Person2{
	String name;
	int age;
	
	//getter 	-getname() 불가, 왜? 추후 jsp tag가 자동 호출하는 메소드
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
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
	//? 
	static Person2 getPerson2(){
		return new Person2();
	}
	//?
	static void setPerson2(Person2 p) {
		//?Person2 객체의 name값에 친구이름 출력하기
		
		p.setName("서지오");
		System.out.println("이름:"+p.name);
	}
	
	
	public static void main(String[] args) {
		//? getPerson2() -> setPerson2() 호출 해보기
		Person2 p = getPerson2();
		setPerson2(p);
		//? 새로운 Person2 객체 생성 후 setPerson2() 호출 후 이름값 수정하기
		Person2 p1 = new Person2();
		p1.name = "박기정";
		System.out.println("이름:"+p1.name);
		
	}

}
