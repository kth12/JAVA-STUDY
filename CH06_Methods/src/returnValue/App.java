package returnValue;

public class App {

	public static void main(String[] args) {
		// 리턴값이 있는 메소드사용
		ReturnMethod r1 = new ReturnMethod();
		
		// r1.getAnimal(); 을 cat 변수에 리턴 => ReturnMethod 클래스에 void가 String으로 바뀜
		String cat = r1.getAnimal();
		
		System.out.println("캣 변수는 : " + cat); 
	}

}

