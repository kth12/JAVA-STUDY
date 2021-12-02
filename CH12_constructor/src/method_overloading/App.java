package method_overloading;

public class App {
public static void main(String[] args) {
	//매소드 오버로딩 매소드의 이름은 같지만 매개변수가 다를때
	person person = new person();
	
	person.greet();
	person.greet("태수");
	person.greet();
	person.greet("태현");
	person.greet(190);
	person.greet("태현",191);
}
}
