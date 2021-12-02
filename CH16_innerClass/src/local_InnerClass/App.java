package local_InnerClass;

public class App {
	private String name; //인스턴스 변수
	
	public App() {
		name = "엘리자베스";
	}
	
	public static void main(String[] args) {
//		System.out.println(name); 사용불가
		App app = new App();
//		app.name = "펭수";
		app.run();
	}
	
	private void run() {
		//클래스안에 메소드 클래스
		
		class Printer {
			public void print() {
				System.out.println(name); //내부클래스는 상위클래스의 변수를사용가능
			}
		}
//		Printer p = new Printer();
//		p.printer(); 아래와 같음?
		new Printer().print();
	}
}
