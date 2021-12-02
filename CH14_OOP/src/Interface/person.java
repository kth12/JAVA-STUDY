package Interface;

//인터페이스 구현(상속)할때 implements 사용, 상속한 클래스에서 추상메소드 완성(구현)
public class person implements describable {

	@Override
	public String getDescription() {
		return "사람입니다 입니다.";
	}

}
