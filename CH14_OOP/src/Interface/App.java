package Interface;

public class App {
	public static void main(String[] args) {
		//인터페이스
	//	describable ds = new describable(); 객체를 만들수 없다.
		describable[] objs = {new person(), new computer()};
		
		for(describable ob : objs){
			System.out.println(ob.getDescription());
		}
	}

}
