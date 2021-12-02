package timer_example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask {
<<<<<<< HEAD

	@Override
	public void run() {
		System.out.println("헬로우");

=======
	@Override
	public void run() {
		System.out.println("헬로우");
>>>>>>> c4c473824c17d4a13bde59c86164c3275153af0a
	}
}

public class App {

	public static void main(String[] args) {
<<<<<<< HEAD

		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000);

=======
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0L, 100L);
>>>>>>> c4c473824c17d4a13bde59c86164c3275153af0a
	}

}
