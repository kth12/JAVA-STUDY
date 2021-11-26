package polymorphism;

public class App {

	public static void main(String[] args) {
		// 다형성 : 자식 클래스 타입을 부모타입으로 형 변환
//		Cat cat1 = new Cat();
//		cat1.vocal();
//		
//		Cat cat2 = new HouseCat(); // HouseCat -> Cat(부모타입)을 쓴다
//		cat2.vocal();
//		cat2.hunt();
//		
//		Cat cat3 = new RoadCat();
//		cat3.vocal();
//		cat3.hunt();
//		
//		Cat tiger = new Tiger();
//		tiger.vocal();
//		
//		Cat[] cats = {cat1,cat2,cat3};
//		
//		for(Cat c : cats) {	//cats 배열의 각각의 객체가 c에 대입하여 반복
//			c.vocal();
//			c.hunt();
//		}
		
		Cat[] cats = { new HouseCat(),new RoadCat(),new Tiger()};
		//cats[0] == new HouseCat();
		//cats[1] == new RoadCat();
		//cats[2] == new Tiger();
		
		// String[] s = {new String("문자열1"),new String("문자열2"),new String("문자열3")};
		
		for(int i=0; i<cats.length; i++) {
			cats[i].vocal();
			cats[i].hunt();
		}
		
		// for each 반복문
		for(Cat c : cats) {
			c.vocal();
			c.hunt();
		}
		
		// 캐스팅 형변환 (기본 데이터 타입) 
		int a = (int)1.2345; // 실수를 정수로 변환
		System.out.println(a);
		
		// 참조형 타입 (상속관계일때)
		Cat cat1 = new HouseCat();	// 업캐스팅
		HouseCat cat2 = (HouseCat)cat1;	//다운캐스팅
		
	
	}

}
