package method_overloading;

public class App {
public static void main(String[] args) {
	//매소드 오버 로딩 (매소드는 이름과 매개변수가 전부 같아야 같은 메소드)
	person p = new person();
	
	p.greet();
	p.greet("펭수");
	System.out.println("123");
}
}
