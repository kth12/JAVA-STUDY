package application;

import java.util.Scanner;
public class Hanman {
	private boolean running = true; // 게임을 계속 진행
	private Randomword word = new Randomword();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		do {
			displayword(); //화면에 단어표시
			getUserInput(); // 입력받음
			checkUserInput(); // 맞는지 체크 (전부 맞으면 running = false)
		}while(running);
	}

	private void displayword() {
//		 System.out.println("화면에 단어표시");
		// 2. 랜덤 워드 객체를 생성해 랜덤으로 한 단어를 출력한다.

		System.out.println(word.toString());
		
	}

	private void getUserInput() {
		// 유저에게 한 문자 입력요구
		// 입력받은 문자열에서 한 문자를 뽑아서
		// Randomword 객체에 전달 ( addGuess(문자) 메소드를 만들자)
		System.out.print("한문자 입력 : ");
		String guess = scanner.nextLine(); // 입력받은 문자열을 guess에 저장
		// 단어에서 입력받은 문자가 있는지 확이내해서 치라하ㄴ다.(단어는 Randomword 갹체 word를 사용)
		word.addGuess(guess.charAt(0));
	}
	private void checkUserInput() {
		// System.out.println("맞는지 체크");
		// 게임종료 확인을 하는 메소드 isCompleted 를 Randomword 클래스에 만들기
		if(word.inCompleted()) {
			System.out.println("잘맞췄어요!");
			System.out.println("정답은 " + word.toString());
			running = false;
		}
	}
	/**
	 * 스캐너를 닫는 메솓드
	 */
	public void close() {
		scanner.close();
	}

}
