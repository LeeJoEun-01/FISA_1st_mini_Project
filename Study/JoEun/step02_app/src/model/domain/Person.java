package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Person {

	private String id;
	private int pw;
	
	// 생성자 오버로딩
//	public Person() {}
//	public Person(String id, int pw) {
//		this.id = id;
//		this.pw = pw;
//	}
	
	
	

}
