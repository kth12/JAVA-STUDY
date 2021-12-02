package static_InnerClass;
//
//import java.net.http.HttpResponse.BodyHandler;

public class Person {
	class Head {
		public void print() {
			System.out.println("헤드");
		}
	}
	static class Body {
		public void print() {
			System.out.println("바디");
		}
	}
	public void print() {
		Head head = new Head();
		Body body = new Body();
		//내부틀래스는 클래스안에서 객체를 만들어 사용하면 쉽게 사용
		head.print();
		body.print();
	}
}
