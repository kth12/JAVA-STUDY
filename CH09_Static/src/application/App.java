package application;

public class App {

	public static void main(String[] args) {
		// 스태틱 변수는 클래스명.변수로 객체를 생성없이 클래스 명만 가지고사용
		System.out.println(Cat.FOOD);
		System.out.println(Math.PI);
		
		System.out.println(Cat.count); //0
		Cat cat1 = new Cat("마틸다");
		System.out.println(Cat.getCount()); //1
		Cat cat2 = new Cat("라이언");
		System.out.println(Cat.getCount()); //2
		
		
		System.out.println(cat1.toString());
		System.out.println(cat2.toString());
		Cat cat3 = new Cat("울버린");
		System.out.println(Cat.getCount());
		System.out.println(cat3.toString());
	}

}
