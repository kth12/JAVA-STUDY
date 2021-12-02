package default_Constructor;

public class Person {

	private int age;
	private String name;

	public Person() {
		System.out.println("디폴트 생성자로 생성됨");
		name = "모름";
		age = 0;
	}

	public Person(String name) {
		System.out.println("사람이 생성됨");
		this.name = name;
		age = 0;
	}

	public Person(String name, int age) {
		System.out.println("person이 생성됨!");
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "person [ name = " + name + ",age=" + age + "]";
	}

}
