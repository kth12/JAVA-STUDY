package super_Constructor;

public class Employee extends Person {
	public Employee() {
		super("익명"); //부모클래스의 생성자 먼저 생성
		System.out.println("Emplouee 생성자");   //2번생성.
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
