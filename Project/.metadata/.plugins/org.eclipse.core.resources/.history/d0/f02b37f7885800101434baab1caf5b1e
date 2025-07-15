package view;

import model.domain.Employee;

//web 수업시간에 jsp로 개발 및 보기좋은 화면으로 구성 예정
public class SuccessView {

	public static void print(String successMsg, Employee[] datas) {
		System.out.println(successMsg);
		System.out.println("사원번호\t사원명\t부서번호");
		
		for(Employee emp : datas) {
			System.out.println(emp.getEmpno() 
								+ "\t" + emp.getEname() 
								+ "\t" + emp.getDeptno());
		}
	}

}
