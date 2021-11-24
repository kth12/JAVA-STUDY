package exam1;

public class Menu {
	String[] option = {"아이템 보기","아이템 추가","아이템 삭제","종료"};
	
	void display() { // 옵션 메뉴들을 출력한다
		for(int i=0; i<option.length; i++) {
			System.out.printf("%d. %s \n",i,option[i]);
		}
	}

}
