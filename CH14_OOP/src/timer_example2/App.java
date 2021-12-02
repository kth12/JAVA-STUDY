package timer_example2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Task implements Runnable { //Runnable의 추상메소드를 구현(완성)한다.
	// 할일의 코드르 적는다
	public void run() {
		System.out.println("헬로우2");
	}
	
}

public class App {

	public static void main(String[] args) {
		// 타이머2
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS); //1초에 한번씩 반복 , null은 할일)
	}

}
