package step02;
//java.lang package만 제외하곤 모두 다 import 필수
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
class Person2{
	String name;
	int age;
	
	//getter - getname()불가 추후 ? jsp tag가 자동 호출하는 메소드
	public String getName() { 
		return name;
	}
	public void setName(String name) { //setter
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
public class MethodLab2 {
//
	static Person2 getPerson2(){
		return new Person2();
	}
	
	static void setPerson2(Person2 p) { //setPerson2는 Setter, getter만으로 객체의 이름 설정을 할 수 있는 메소드이다.
		
		//Person2 객체의 name 값에 친구이름
		p.setName("현빈");
		System.out.println(p.getName());
		
	}
	public static void main(String[] args) {
		//? getPerson2() -> setPerson2() 호출 해보기
		Person2 d = getPerson2();
		setPerson2(d);
		
		//?새로운 Person2 객체 생성 후 setPerson2*(호출 후 이름 값 수정하기
		Person2 e = getPerson2();
		setPerson2(e);
		e.name = "이순신";
		System.out.println(e.name);
		setPerson2(e);
		System.out.println(e.name);
	}
}
