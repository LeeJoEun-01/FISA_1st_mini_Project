/* 학습내용
 * Controller -> Model -> Database -> Model -> Controller
 * 
 * server 내부에 객체수를 강제로 조절
 * 	-단 하나 보장
 * 	-강제저긍로 코드로 객체 생성 금지
 * 	-단, 자신의 클래스 내부에서 하나의 객체 생성만 해서 공유
 */

package model;

import model.domain.Person;

public class Model {
	private Database db = new Database();
	
	private static Model model = new Model();
	//외부에서 생성자 호출 금지를 위한 명시적인 개발
	private Model() {}
	public static Model getModel() {
		return model;
	}
	//검색 처리 - client 100번 호출~
	public Person getPersons() {
		return db.getPersons();
	}
	
	
}
