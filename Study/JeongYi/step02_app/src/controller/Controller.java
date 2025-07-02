//controller는 startView, Model이랑 controller와 소통
/*StartView -> Controller -> Model -..>Controller
 * ->정상  : SuccessView or 비정상  FailView
 * 
 * */

//Persons 즉 사람들의 정보가 담긴 데이터베이스(Database)에서 회원들의 정보(Person)가 있는지 가져와서 있으면 successMsg를 출력하고 실패하면 FailMsg를 출력하는 controller의 역할을 합니다. 
package controller;

import model.Model;
import model.domain.Person;
import view.FailView;
import view.SuccessView;

//CRUD 모든 요청 수용하는 클래스
public class Controller {
	
	private static Model model = Model.getModel();//private staic은 메소드 호출을 최소화하기 위해 멤버변수로 따로 지정
	
	//모든 검색 메소드 
	//데이터 정상 비정상 검증 null값으로 간단하게 진행
	//메소드들 호출도 가급적 최소화해서 성능 고려...
	//Spring의 멤버에 @Autowride 등등 연관
	public static void getPersons(){ //반환타입 없다 왜?
		
		Person data = model.getPerson(); //밑 코드 최소화
//		Model m = Model.getModel();
//		Person data = m.getPerson();
		
		
		if(data != null) { //정상
			SuccessView.print("데이터 존재합니다.");
		}else { // 비정상
			FailView.print("데이터가 비존재합니다.");
		}
	}
	//?

}
