package application;

import java.util.Scanner; //java.util 패키지 안에 Scanner클래스를 불러와서 사용가능

public class UserInput {

	public static void main(String[] args) {
		// 입력을 받는 클래스
		Scanner scanner = new Scanner(System.in); //스캐너 객체를 선언

		System.out.print("온도를 입력해 주세요");

		double c =scanner.nextDouble(); //섭씨 변수 c초기값을 25
		double f = (c * 9/5) + 32; //화씨 변수는 f
		
		System.out.printf("섭씨 %.1f는 화씨 %.1f 이다",c,f);
	}

}
