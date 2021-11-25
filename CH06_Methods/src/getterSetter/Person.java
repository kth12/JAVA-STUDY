package getterSetter;

public class Person {
	// private는 같은 클래스에서만 접근가능
	private String name; // this name을 의미
	private int age;
	
	// public은 다른 클래스에서 쓸수있음
	// set은 값을 입력하는 메소드
	public void setName(String name) { //p1.setName("펭수"); 리턴하지 않아서 void
		this.name = name; // 이때 this는 인스턴스 의미
	}
	
	// get메소드는 값을 리턴하는 메소드
	public String getName() {
		return name;
	}
	
	
	public void setAge(int age) {
		// System.out.println(this); // 주소 (p1,p2의 주소값은 다르다)
		this.age = age;
	}
	
	public int getAge() {
		//System.out.println(this);
		return age;
	}
	
}
