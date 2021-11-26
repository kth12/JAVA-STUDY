package polymorphism;

public class HouseCat extends Cat{
	
	@Override // 부모와의 메소드가 다르면 빨간밑줄로 알려줌 
	public void vocal() {	//오버라이딩 메소드 : 자식클래스에서 부모와 똑같은 메소드(vocal())를 만듬
		System.out.println("미야우~");
	}
}
