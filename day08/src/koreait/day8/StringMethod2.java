package koreait.day8;

public class StringMethod2 {
	// 문자열 메소드 2
	public static void main(String[] args) {

		// 1. indexOf : contains 처럼 특정 문자열을 찾아서 시작 위치값을 변환
		String msg = "koreait.2021@gmail.com";
		System.out.println("gmail의 시작 위치 : " + msg.indexOf("gmail"));
		System.out.println("naver의 시작 위치 : " + msg.indexOf("naver")); 		// 해당 문자열이 없을땐 -1을 변환
		
		
		msg = "it gmail it gmail";
		System.out.println("마지막 gmail의 시작 위치 : " + msg.lastIndexOf("gmail"));
		
		// 2. 문자열의 첫부분 또는 마지막부분을 검사
		System.out.println("korea로 시작하는가? " + msg.startsWith("korea"));
		System.out.println("it로 시작하는가? " + msg.startsWith("it"));				
		
		System.out.println("mail으로 끝나는가? " + msg.endsWith("mail"));
		System.out.println("@로 끝나는가? " + msg.endsWith("@"));				
		
		// 3. 문자열 부분 추출
		msg = "i like java";
		String temp;
		temp = msg.substring(3);
		System.out.println("substring(3) : " + temp);
		System.out.println("substring(4, 8) : " + msg.substring(4, 8));
		
		// 문제 : java 추출하려면 substring 메소드 인자는?
		temp = msg.substring(7);
		System.out.println(temp);
		
		// 문제 : like 추출하려면 substring 메소드 인자는?	
		temp = msg.substring(2, 6);
		System.out.println(temp);
		
		int start = msg.indexOf("like");
		int len = "like".length();
		temp = msg.substring(start, start + len);
		System.out.println("start : " + start + ", len : " + len + ", 추출결과 : " + temp);
		
		// 4. 문자열 치환하기(바꾸기)
		msg = "koreait.2021@gmail.com - 2021";
		temp = msg.replace("2021", "1999");			// 인자 2개 - 첫번째는 찾는 문자열, 두번째는 바꿀 문자열
		System.out.println("replace 결과 : " + temp);
		temp = msg.replace("gmail", "daum");
		System.out.println("replace 결과 : " + temp);
		
		msg = "그는 오늘 치킨을 그녀와 먹는다. 치킨 브랜드는 ... 치킨의 재료 원산지는 브라질산이다.";
		// msg 문자열에서 "치킨"이 몇번 나오는지 출력해봅시다.
		int idx; 	// 치킨의 위치 저장
		int cnt = 0;	// 카운트 변수
		temp = msg;
		String find = "그녀";
		
		while (true) {
			idx = temp.indexOf(find);
			if (idx == -1) {
				break;
			}
			cnt++;
			temp = temp.substring(idx + find.length()); 	// -> 첫번째 치킨 뒤부터 문자열 추출
			
		}
		
		System.out.println(find + "가 나온 횟수 : " + cnt);
	}

}
