package koreait.day13;

import java.util.Scanner;
import java.util.TreeMap;

public class MyDictionary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeMap<String, String> dic = new TreeMap<>();
		String eng, kor, sel;
		String search;
		boolean run = true;	
		
		while(run) {	// while 안에 switch로 종료조건을 동작시킬 때 break는 while반복을 종료하지 못함 -> 변수 사용
			System.out.println("선택 기능	1. 단어저장	2. 단어검색	3. 단어장보기	4. 프로그램 종료");
			System.out.print("선택 -> ");
			sel = sc.nextLine();
			
			switch (sel) {
			case "1":
				System.out.print("English -> ");
				eng = sc.nextLine();
				System.out.print("Korean -> ");
				kor = sc.nextLine();
				
				if (dic.containsKey(eng)) {
					dic.put(eng, (dic.get(eng) + ", " + kor));
				} else	dic.put(eng, kor);
				break;
				
			case "2":
				System.out.println("검색단어 English -> ");
				search = sc.nextLine();
				System.out.println("단어장에 검색했습니다. => " + dic.get(search));
				break;
				
			case "3":
				System.out.println("단어장 전체보기 : " + dic);
				break;

			case "4":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				
			default:
				System.out.println("잘못 입력된 선택입니다. 1~4 입력입니다.");
				break;
			}
		}
		
	}

}
