package multi_inheritance;

<<<<<<< HEAD
interface speaker {
	void speak(); // 추상메소드
}

interface greeter {
=======
interface Speaker {
	void speak(); // 추상메소드
}

interface Greeter {
>>>>>>> c4c473824c17d4a13bde59c86164c3275153af0a
	void greet();
}

public class App {

	public static void main(String[] args) {
		// 인터페이스는 다중 구현이 가능
		Person p1 = new Person();
		p1.greet();
		p1.speak();
<<<<<<< HEAD

		speaker p2 =new Person(); //person이 구현한 인터페이스 speaker로 선언
		p2.speak();
		//p2.greet();  speaker 인터페이스의 추상메소드만 사용가능
		
		greeter p3 = new Person(); //
		p3.greet();
		//p3.speak(;)  greet 인터페이스의 추상메소드만 사용가능
	}
=======
		
		Speaker p2 = new Person(); //Person이 구현한 인터페이스 Speaker로 구선언
		p2.speak();
//		p2.greet(); Speaker 인터페이스의 추상메소드만 사용가능
		
		Greeter p3 = new Person(); //Person이 구현한 인터페이스 Greeter로 구선언
		p3.greet(); 
//		p3.speak(); Greeter 인터페이스의 추상메소드만 사용가능
		
	}

>>>>>>> c4c473824c17d4a13bde59c86164c3275153af0a
}
