package school;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("철수",34);
		Student s2 = new Student("미영",23);
		Student s3 = new Student("한나",49);
		Student s4 = new Student("효신",26);
		
		s1.setVisible(false);	// 철수는 원격, 온도측정 안함
		
		s2.setTemperature(35.5);	// 길동은 집체, 온도 35.5
		
		s3.setTemperature(36.5);	// 한나는 집체, 온도 36.6
		
		s4.setVisible(false);	// 효신도 원격

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());
		

	}

}
