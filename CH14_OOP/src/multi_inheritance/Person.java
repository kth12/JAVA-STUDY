package multi_inheritance;

<<<<<<< HEAD
public class Person implements speaker, greeter {

	@Override
	public void greet() {
		System.out.println("환영합니다~");
		
	}

	@Override
	public void speak() {
		System.out.println("나는 사람입니다.");
	}

=======
public class Person implements Speaker, Greeter{

	@Override
	public void greet() {
		System.out.println("환영합니다");	
	}
	
	@Override
	public void speak() {
		System.out.println("나는 사람 입니다");
	}
	
>>>>>>> c4c473824c17d4a13bde59c86164c3275153af0a
}
