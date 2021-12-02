package interfaces;

public class App {
	public static void main(String[] args) {
		//인터페이스
		//Describable ds= new Describable(); 객체를 만들수없다. 
		
		Describable[] objs = {new Person(), new computer()};
		for(Describable ob : objs) {
			System.out.println(ob.getDescription());
		}
	}
}
