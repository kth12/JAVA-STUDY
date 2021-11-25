package application;

public class Increment {

	public static void main(String[] args) {
		// 증가 감소 연산자
		int count = 0;
		
		count = count + 1;
		System.out.println(count);
		count += 1;
		System.out.println(count);
		count++;
		System.out.println(count);
		++count;
		System.out.println(count);

		// 위와같이 4가지 방법으로 1씩 감소 시켜라.
		count = count - 1;
		System.out.println(count);
		count -= 1;
		System.out.println(count);
		count--;
		System.out.println(count);
		--count;
		System.out.println(count);
		
	}

}
