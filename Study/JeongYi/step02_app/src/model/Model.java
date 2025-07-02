/*학습내용
 * Client -> controller -> Model -> Database -> Model -> Controller
 * 
 * 싱글통 디지인 패턴
 * server 내부에 객체수를 강제로 조절
 * - 단 하나 조정
 * - 강제적으로 코드로 객체 생성 금지
 * 단 , 자신의 클래스 내부에서 하나의 객체 생성만 해서 공유
 * */

package model;
import model.domain.Person;

public class Model {
	//검색 처리 - client 100번 호출
	private Database db = new Database();
	
	private static Model model = new Model();
	//외부에서 생성자 호출 금지를 위한 명시적인 개발
	//위 라인은 생성자 미 코딩시에 public Model(){}으로 생성 안하면 외부에서 생성가능해서 꼭ㄱ해야해
	
	private Model() {}
	public static Model getModel() {
		return model;
	}
	
	public Person getPerson(){
		return db.getPersons();
	}
	
}