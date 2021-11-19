package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조 변수(reference variable)은 주소값을 가진다.
//		String text = null; // 널 값은 주소값이 없다 , 실제 값을 만들었을때 주소만 가진 text에 값을 넣는 참조변수
//		// int x = null; 기본 자료형에는 널값을 입력불가 (널값은 주소가 없다는 뜻)
//		//text = new String("헬로우");  // 배열을 쓸때
//		text = "헬로우";		
//		System.out.println(text); // 주소값 = 헬로우
		
		String[] texts = null;
		System.out.println(texts);		// 주소값 = null
		texts = new String[3];			// 배열 (문자열3칸)을 실제 생성해서 texts에 주소입력
		System.out.println(texts);		// 주소 ???
		System.out.println(texts[0]);	// null, 문자열에 주소값이 없다
		
		texts[0] = new String("하이!");
		texts[1] = "안녕";
		texts[2] = "굿바이";
		
		for(String w : texts) {
			System.out.println(w);
		}
	}

}
