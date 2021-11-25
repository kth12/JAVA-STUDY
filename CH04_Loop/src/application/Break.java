package application;

public class Break {

	public static void main(String[] args) {
		// break; 사용시 반복문 안에서 빠져나옴
		int count = 0;
		
		while (true) {
			System.out.println("헬로우 " + count);
			
			if (count == 5) {
				break;
			}
			
			System.out.println("how are you. ");
			
			count++;
		}
		
		System.out.println("프로그램 종료. "); // 5가 되어 break 후 while문을 빠져나와서 종료 
		
	}

}
