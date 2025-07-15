//html파일로 변환
package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		System.out.println("*** step01 : 모든 사원 검색");
		Controller.getEmployees();
		
		/* 추가 로직
		 * - 존재하는 부서 번호에 소속된 직원들만 검색
		 * - 직원들 미존재시 미존재 메세지 출력 
		 */
		System.out.println("*** step02 : 특정 부서 사원만 검색");
		System.out.println("----- 10번 부서에 소속된 사원들");
		Controller.getDeptnoEmployee(10);
		
		System.out.println("----- 100번 부서에 소속된 사원들");
		Controller.getDeptnoEmployee(100);
		
	}

}





