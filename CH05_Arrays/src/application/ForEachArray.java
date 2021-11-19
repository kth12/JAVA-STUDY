package application;

public class ForEachArray {

	public static void main(String[] args) {
		// 배열에 사용할 수 있는 for each 반복문
		// 간단한 배열의 반복에는 for each문을 사용하고 인덱스 번호가 필요한 경우 for문을 사용
		String[] fruits = {"사과","수박","바나나"};
		int[] n = {1,2,3};
		boolean[] b = {true,false,true};
		double[] d = {1.1, 2.2, 3.3, 4.4};
		
		for(String x : fruits) {   // for each문은 ( 변수 : 배열 ) , 변수와 배열의 타입은 같아야함
			System.out.print(x + " ");
		}
		System.out.println();
		for(int x : n) {   
			System.out.print(x + " ");
		}
		System.out.println();
		for(boolean x : b) {   
			System.out.print(x + " ");
		}
		System.out.println();
		for(double x : d) {   
			System.out.print(x + " ");
		}

	}

}
