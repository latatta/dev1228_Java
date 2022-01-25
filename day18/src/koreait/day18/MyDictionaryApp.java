package koreait.day18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MyDictionaryApp { // 애플리케이션 클래스(main 메소드를 실행 시작합니다.)

	// 전역변수 선언
	private static Scanner sc = new Scanner(System.in);
	private static List<Word> mywords = new ArrayList<>();

	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("선택 기능 👉	1. 단어추가	2. 단어보기	3. 파일에 저장	 4. 파일에서 불러오기	   5.프로그램 끝내기");
			System.out.print("선택 -> ");
			String sel = sc.nextLine();
			String filename = "C:\\dev1228\\dev\\test\\mydict.txt";

			switch (sel) {
			case "1":
				wordAdd();
				break;

			case "2":
				wordList();
				break;

			case "3":
				wordSave(filename);
				break;

			case "4":
				wordRead(filename);
				break;

			case "5":
				run = false;
				break;

			default:
				System.out.println("::: 잘못된 입력입니다. :::");
				break;
			}

		} // while end
		System.out.println("::: 프로그램을 종료합니다. :::");

	}

	// 예시 : mywords에 저장된 내용이 milk : 우유, book : 책, car : 자동차 라고 할 때
	// 지금 입력된 eng는 book, kor은 예약하다 라고 한다면 기존에 저장된 단어일 때 koreans필드에 새로운 뜻의 kor만 요소로
	// 추가한다.

	private static void wordAdd() { // 단어 추가
		System.out.println("[새로운 단어 추가]입니다.");
		do {
			System.out.print("\nEnglish -> ");
			String eng = sc.nextLine();
			System.out.print("우리말 뜻 -> ");
			String kor = sc.nextLine();

			// 입력받은 eng가 myword 리스트에 있는가?(for문 사용) 있다면 - 몇번째 인덱스인지 알아내서 그 위치에 kor add하기, 없다면
			// - kor 추가할 리스트 생성해서 담기
			List<String> koreans;
			boolean flag = false;
			for (int i = 0; i < mywords.size(); i++) {
				Word w = mywords.get(i);
				if (w.getEnglish().equals(eng)) { // 단어장에 있는 단어일 때
//					index = i;						// index 변수는 for문 밖에서 같은 단어의 인덱스 위치값을 활용할 때 사용
					flag = true;
					koreans = w.getKoreans(); // 이미 존재하는 리스트 객체를 가져와서 koreans 변수가 참조합니다.
					koreans.add(kor);
					break;
				}
			}

			// index 변수가 -1이라면 단어장에 없는 단어 -kor 추가할 리스트 생성해서 담기 -> Word 객체 생성해서 mywords에 추가하기
			if (!flag) {
				koreans = new ArrayList<>(); // 우리말 뜻 리스트 생성
				koreans.add(kor);
				mywords.add(new Word(eng, koreans));
			}

			System.out.println("단어 추가 계속 하시겠습니까?(y or n)");

		} while (sc.nextLine().equals("y"));
	}

	private static void wordList() { // 단어 목록
		for (Word w : mywords) {
			System.out.println(w);
		}
	}

	private static void wordSave(String filename) { // 파일에 단어들 저장(저장할 파일 경로와 파일 이름을 filename으로 전달)
		File file = new File(filename);

		try {
			PrintWriter pw = new PrintWriter(file);
			for (Word w : mywords) {
				pw.println(w);
			}
			pw.close();

		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다.");
		}

	}

	private static void wordRead(String filename) { // 파일에서 단어 읽어오기
		File file = new File(filename);

		try {
			Scanner fsc = new Scanner(file);

			while (fsc.hasNext()) {
//				System.out.println(fsc.nextLine());				
				StringTokenizer stk = new StringTokenizer(fsc.nextLine(), ":[]");			// 구분기호
				while (stk.hasMoreTokens()) { 						// 파일에서 1라인씩 읽어오고 그것을 토큰화하기 -> Word 객체 생성할 필드값
//					System.out.println(stk.nextToken(":["));
					Word w = new Word(stk.nextToken()); 			// 첫번째 토큰을 english 필드값 저장
					List<String> kor = Arrays.asList(stk.nextToken().split(", ")); 		// split 결과 타입은 문자열배열 -> 리스트로 변환
					w.setKoreans(kor); 			// 두번째 토큰을 리스트로 변환해서 koreans 필드값으로 참조
					mywords.add(w); 			// Words 객체를 mywords 리스트에 추가
					// substring 메소드로 "]" 제외
				}
			}
			fsc.close();
		} catch (FileNotFoundException e) {
			System.out.println("없는 경로 또는 파일입니다.");
		}
	}

}
