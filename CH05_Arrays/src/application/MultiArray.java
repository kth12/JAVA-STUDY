package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중배열[][]
		String[][] texts = {
				{"하나","둘","셋"}, 	//배열1개
				{"넷","다섯","여섯"}, 	//배열2개
				{"일곱","여덟","아홉"}	//배열3개
		};

		for(int i = 0; i<texts.length; i++) {	// 배열의 개수 (총3개)
			System.out.printf("%d번째 배열 %s \n",i,texts[i]);  // 왜 주소가 나오더라...
			String[] inArray = texts[i]; // 배열을 inArray에 넣기
			
			for(int j = 0; j<texts[i].length; j++) { // 배열[0].length --> 하나 둘 셋
				System.out.printf("%s \t",texts[i][j]);
			}
			System.out.println(); // 두번쨰 for문을 빠져나가서 다음줄로 넘어가 첫번째 for문으로 다시 시작
			
		}
	}

}
