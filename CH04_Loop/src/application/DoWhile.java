package application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행

//		int count = 2;
//		
//		System.out.println("do while 반복문");
//		
//		do {
//			System.out.println("카운트 : " + count); // 100으로 해놔도 처음 100은 출력이됨
//		} while(count++ < 5);
		
		// 값은 2,3,4
		
		
		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		String password = ""; // (전역변수)문자열 선언과 초기값을 공백으로 //코드 안 password를 밖에서 선언하여 쓰기위해
		
		do {
			System.out.print("비번 입력 > ");
			password = scanner.nextLine();
			// scanner.close(); 이 위치에 쓰면 한번쓰고 종료되는..
			
		} while(!password.equals(USER_PASSWORD) == true); // 비번이 같지 않은게 true면 반복, 같으면 false라 빠져나옴 
		
		//while(password.equals(USER_PASSWORD) == false); // 비번이 맞으면 true인데 빠져나오기 위해 false
		
		scanner.close();
		System.out.println("접속승인"); // 비번hello(true) = false 빠져나와서 접속승인 
	}

}
