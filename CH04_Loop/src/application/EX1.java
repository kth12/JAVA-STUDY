package application;

import java.util.Scanner;

public class EX1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("옵션을 선택 > ");
		int input = scanner.nextInt();
		scanner.close();
		
		if (input == 1) {
			System.out.println("헬로우");
		}
		else if (input == 2) {
			System.out.println("안녕?");
		}
		else if (input == 3) {
			System.out.println("프로그램 종료");			
		}
		else {
			System.out.println("잘못된 접근입니다.");
		}
		
		//Switch case문으로 수정
		switch(input) {
		case 1: 
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕??");
			break;
		case 3:
			System.out.println("프로그램 종료");
			break;
		default :
			System.out.println("잘못된 접근입니다.");
			break;			
			
		}
	}
}
