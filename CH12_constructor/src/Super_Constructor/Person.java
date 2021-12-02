package Super_Constructor;

public class Person {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	public Person(String name) {
		System.out.println("Person생성자 !");
	}
}

