/*
 * StartView -> Controller -> Model -..> Controller
 * -> 정상 : SuccessView or 비정싱 : FailView 
 */

package controller;

import model.Model;
import model.domain.Person;
import view.FailView;
import view.SuccessView;

//CRUD 모든 요청 수용하는 클래스
public class Controller {
	//Model 객체는 Controller에서 한번한 멤버 변수로 받아와서
	//모든 메소드들이 사용하게 하는 구조 권장
	//메소드들 호출도 가급적 최소화해서 성능 고려
	//Spring의 멤버에 @Autowride 등등 연관
	private static Model model = Model.getModel();
	//모든 검색 메소드
	//데이터 정상 비정상 검증 null값으로 간단하게 진행
	public static void getPersons() {	
		Person data = model.getPersons();
		if(data != null) { //정상
			SuccessView.print("데이터가 존재합니다");
		}else {
			FailView.print("데이터가 존재하지 않습니다");
		}
	}
	
}
