package multi_inheritance;

interface speaker {
	void speak(); // 추상메소드
}

interface greeter {
	void greet();
}

public class App {

	public static void main(String[] args) {
		// 인터페이스는 다중 구현이 가능
		Person p1 = new Person();
		p1.greet();
		p1.speak();

		speaker p2 =new Person(); //person이 구현한 인터페이스 speaker로 선언
		p2.speak();
		//p2.greet();  speaker 인터페이스의 추상메소드만 사용가능
		
		greeter p3 = new Person(); //
		p3.greet();
		//p3.speak(;)  greet 인터페이스의 추상메소드만 사용가능
	}
}
