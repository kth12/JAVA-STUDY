package application;

public class For {

	public static void main(String[] args) {
		// for반복문 for(초기값;조건;증감){명령문;}
//		for (int i = 0; i < 10; i++) {
//			System.out.println("i : " + i);
//		}
		// 1에서 100까지 합
		int sum = 0;
		for (int i =1; i<=100; i++) {
			sum = sum + i;
			
		}
		System.out.println(sum);
	}
	

}
