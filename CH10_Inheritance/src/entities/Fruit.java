package entities;

public class Fruit {
	protected int id; // 다른 패키지에는 사용할 수 없다, 상속한 자식클래스에서는 사용가능
	
	@Override
	public String toString() {
		return "Fruit [아이디 =" + id + "]";
	}
}
