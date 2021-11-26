package game;

import java.util.Random;
import game.objects.*;


public class Game {
	
	GameObject[] objects = {new Scissors(),new Rock(), new Paper() };
	
	Random random = new Random();
	
	public void run() {
		System.out.println("게임시작...");
		
		int num = random.nextInt(objects.length); // 0,1,2 랜덤
		GameObject ob = objects[num]; // 가위 바위 보 중 하나가 ob에 넣음
		System.out.println(ob); // 오버라이드를해서 .toString() 생략
	}
	
	
}
