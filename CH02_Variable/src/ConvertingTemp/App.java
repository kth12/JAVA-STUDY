package ConvertingTemp;

public class App {
	public static void main(String[] args) {
	// 섭씨온도를 화씨온도로 변환 (o도씨 * 9/5) + 32 =32도F
	
		double c =25; //섭씨 변수 c초기값을 25
		double f = (c * 9/5) + 32; //화씨 변수는 f
		
		System.out.println("섭씨 " + c + "는 화씨 " + f + "이다");
	}
}
