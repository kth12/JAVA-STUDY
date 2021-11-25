package method;

public class NewLine {

	public static void main(String[] args) {
		System.out.println("Line 1");
		threeLine();
		System.out.println("Line 2");

	}
	public static void threeLine() {
		oneLine();
		oneLine();
		oneLine();
	}
	public static void oneLine() {
		System.out.println(">");
	}

}
