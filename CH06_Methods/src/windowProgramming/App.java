package windowProgramming;

public class App {

	public static void main(String[] args) {
		// 윈도우 객체를 생성 
		// set 메소드로 값을 입력하고 get메소드로 값을 출력하라
		// 설정 윈도우창의 가로길이 300 세로길이 600
		// 현재 보이도록 true, top 200, left 400
		
		Window w1 = new Window();
		w1.setWidth(300);
		System.out.println("가로길이 "+w1.getWidth());
		
		w1.setHeight(600);
		System.out.println("세로길이 "+w1.getHeigth());
		
		w1.setIsVisible(true);
		System.out.println("현재보임 "+w1.getIsVisible());
		
		w1.setTop(200);
		System.out.println("위치top "+w1.getTop());
		
		w1.setLeft(400);
		System.out.println("위치left "+w1.getLeft());
	}

}
