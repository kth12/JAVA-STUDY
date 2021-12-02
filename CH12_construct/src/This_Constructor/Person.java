package This_Constructor;

public class Person {

	private String name; // 이름
	private int age; // 나이

	public Person() {
		this("익명", 0);
	}

	public Person(String name) { // 생성자는 클래스 이름과 같고 리턴 타입이 없음
		this(name, 0);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		return "[이름 = " + name + ",나이 =" + age + "]";
	}

}
