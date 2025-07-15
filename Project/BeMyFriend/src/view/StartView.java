package view;

import controller.MainController;
import util.ConsoleScanner;

public class StartView {

	public static void viewStart() {
		// 이름을 입력해 주세요
		System.out.println("***************************************\r\n" + "");
		System.out.println("*          👯 친해지길 바라 👯         *");
		System.out.println("***************************************\r\n" + "");

		System.out.println("안녕하세요! 반 친구들과 친해질 수 있는 프로그램입니다.\n");
		System.out.print("이름을 입력해 주세요: ");

		// 이름 입력
		String name = ConsoleScanner.SCANNER.nextLine();
		MainController.handleNameInput(name);
	}

	public static void main(String[] args) {
		viewStart();
	}

}
