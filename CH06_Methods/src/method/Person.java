package method;

public class Person {
		// 클래스 안의 일반 변수 => 인스턴스 변수 (객체 생성시 생성됨)
		String name; //값이 없을때 참조변수에는 null값 
		int age; //값이 없을때 참조변수에는 0 값 
		
		// 클래스 안의 만든 함수를 메소드 => 객체 생성시 사용가능
		void sayHello() {
			System.out.println("하이!" + name);
		}

	
}
