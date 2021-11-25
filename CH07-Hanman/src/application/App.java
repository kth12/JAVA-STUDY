package application;

public class App { // 프로젝트를 실행하기 위한 클래스

	public static void main(String[] args) {
		// 행맨게임 시작
		Hanman game = new Hanman();
		game.run();
		game.close();
	}

}
