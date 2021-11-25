package application;

import java.util.Random;

public class Randomword {
	// 스페이스바로 띄어진 단어들을 문자열로 str에 저장
	private String str = "concept software drama person introduction explanation cheek wedding requirement failure arrival year instance shopping advertising argument presentation meal art assistance perspective gene history instruction complaint mixture quantity computer speaker thanks independence chocolate inflation baseball desk owner administration media Click to save this word! photo blood politics girl product injury satisfaction society leadership member thought disaster";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 단어로 입력
	
	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; //문자배열 선언(철자를 맞추면 저장)
	private Random random = new Random();
	public Randomword() {
		// 생성자에 랜덤 단어를 선택
		selectWord = words[ random.nextInt(words.length)]; //1. 랜덤으로 선택수정
		characters = new char[selectWord.length()]; //선택단어의 길이만큼 문자배열 크기로 생성
	}
	public void getWords() { //현재 words배열에 있는 전체 단어를 출력
		for(String w : words) {
			System.out.println(w);
		}
	}
	public String toString() {
		// 단어를 _로 출력한다.
//		String text = "";
		StringBuilder sb = new StringBuilder();
//		characters[3] = 'x'; //테스트
		
		for(char c : characters) {
			
//			if(c=='\u0000') { //문자('')의 초기값이면 아직 맞추지 못한 문자
//				sb.append('_');
//			}
//			else {
//				sb.append('c'); //맞춘 문자일 경우
//			}
			
			sb.append(c=='\u0000' ? '_' : c); // 못맞추면 _ 맞춘건 c
			sb.append(' '); //철자를 한칸씩 스페이스바
		}
//		System.out.println(selectWord); //정답출력(테스트용)
		return sb.toString(); //선택된 랜덤 단어를 가져옴
	}
	public void addGuess(char c) {
		// 넘어온 문자를 rja사해서 선태ㄱ단어에 이있으면 characters배열에 저장
		for(int i = 0; i < selectWord.length(); i++) { //단어 길이만큼 반복
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}
	}
	public boolean inCompleted() {
		// 철자를 다 맞췄는지 체크해서 true, false로 리턴
		for(char c : characters) { // 단어 전체 철자 반복검사
			if(c=='\u0000') {
				return false; //아직 맞춰야할 문제가 있음
			}
		}
		return true; // 다 맞춤
	}
}
