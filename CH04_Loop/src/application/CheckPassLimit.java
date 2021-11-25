package application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀려도 3번 기회를 준다
		// 맞으면 "접속승인"
		// 3번 틀리면 "접속거부"

		final String USER_PASSWORD = "hello";

		Scanner scanner = new Scanner(System.in);

		boolean accessOK = false;
		String password = "";
		
		for (int i = 1; i <= 3; i++) {
			System.out.print("비번 입력 > ");
			password = scanner.nextLine();

			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				accessOK = true; 
				break; // true면 빠져나가고 비번입력 안나오게
			} else {
				System.out.printf("비번이 %d번 틀림\n", i);
			}
		}
		scanner.close();


		//for문 안의 마지막 else 가 false가 된 상태에서 if(true){접속거부} 나오게
		if (!accessOK) {
			System.out.println("접속거부");
		}

	}

}
