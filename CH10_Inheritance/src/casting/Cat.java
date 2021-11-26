package casting;

// 모든 메소드는 Object를 상속받음, extends Object는 원래 생략됨
public class Cat extends Object{	// 고양이 메소드 야옹과 사냥메소드
	public void vocal() {
		System.out.println("야옹~");
	}
	
	public void hunt() {
		System.out.println("사냥중~");
	}
}
