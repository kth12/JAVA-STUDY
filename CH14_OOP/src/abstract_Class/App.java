package abstract_Class;

public class App {
<<<<<<< HEAD
	public static void main(String[] args) {
		// 추상클래스
		// GameObject obj = new GameObject(); 객체를 만들수 없다. 추상클래스는 객체xx
		
		GameObject[] objs = { new player(), new Monster() };

		for (GameObject ob : objs) {
			System.out.println(ob);
			ob.describe(); //구현된 추상 메소드
		}

=======

	public static void main(String[] args) {
		// 추상 클래스
		//GameObject obj = new GameObject();  객체를 만들 수 없다
		
		GameObject[] objs = { new Player(),new Monster()};
		
		for(GameObject ob : objs) {
			System.out.println(ob);
			ob.describe(); //구현된 추상메소드
		}
>>>>>>> c4c473824c17d4a13bde59c86164c3275153af0a
	}

}
