package windowProgramming;

public class Window {
	private int width; // 가로
	private int height; // 세로
	private boolean isVisible; // 현재 보이는가?
	private int top; // 위치
	private int left; // 위치

	// get set 메소드 만들기
	public void setWidth(int x) {
		this.width = x;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int x) {
		this.height = x;
	}
	public int getHeigth() {
		return height;
	}
	
	public void setIsVisible(boolean x) {
		this.isVisible = x;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	
	public void setTop(int x) {
		this.top = x;
	}
	public int getTop() {
		return top;
	}
	
	public void setLeft(int x) {
		this.left = x;
	}
	public int getLeft() {
		return left;
	}
}
