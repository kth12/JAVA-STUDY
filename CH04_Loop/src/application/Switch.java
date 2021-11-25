package application;

public class Switch {

	public static void main(String[] args) {
		// Switch문
		int option = 0;
		
		switch(option) {
		case 0: // 옵션변수가 케이스 0과 같을때
			System.out.println("옵션 0 선택");
			System.out.println("케이스 0 선택");
			break; //항상 케이스하나 끝에 break작성
		
		case 1: // 옵션변수가 케이스 0과 같을때
			System.out.println("옵션 1 선택");
			break; //항상 케이스하나 끝에 break작성
			
		case 10:// 옵션변수가 케이스 10과 같을때
			System.out.println("프로그램 종료..");
			break; //항상 케이스하나 끝에 break작성
			
		default: // 옵션변수가 케이스 0과 같을때
			System.out.println("잘몫된 옵션번호.");
			break; //항상 케이스하나 끝에 break작성
		}
	}

}
