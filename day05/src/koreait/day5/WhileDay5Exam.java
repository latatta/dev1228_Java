package koreait.day5;

import java.util.Scanner;

public class WhileDay5Exam { // Day5Exam.java 반복실행 -> isOK가 true일 때까지

	public static void main(String[] args) {

		/*
		 * 오늘의 복습문제(Day5Exam.java) : 패스워드 규칙 1) 8글자 이상이어야 한다. 2) 특수문자 1개 이상 포함 3) 영문
		 * 대소문자 각각 1개 이상 포함 4) 숫자 1개 이상 포함
		 */
		Scanner sc = new Scanner(System.in);
		String pw = "";
		int upper_cnt = 0, lower_cnt = 0, numeric_cnt = 0, symbol_cnt = 0;
		boolean isOk = false; // pw 규칙에 맞는지 논리값 저장
		String message = ""; // pw 규칙 불만족 조건 메세지

		// ****연산에 사용되는 변수는 반드시 초기값을 지정해야 한다.****

		System.out.println("[[ 사용자 패스워드 검사 ]]");

		while (!isOk) {		// isOK가 거짓이면 !연산 -> 참
			upper_cnt = 0;
			lower_cnt = 0;
			numeric_cnt = 0;
			symbol_cnt = 0;
			message = "";
			
			System.out.print("사용할 패스워드를 입력하세요. -> ");

			pw = sc.nextLine();
			

			if (pw.length() < 8) {
				message = "1) 8글자 이상이어야 한다.\n";
			}

			// 추가 요구사항 처리
			boolean isUseless = false;

			for (int i = 0; i < pw.length(); i++) {

				char temp = pw.charAt(i);

				if (temp >= 'A' && temp <= 'Z')
					upper_cnt++;

				else if (temp >= 'a' && temp <= 'z')
					lower_cnt++;

				else if (temp >= '0' && temp <= '9')
					numeric_cnt++;

				else if ((temp >= 32 && temp <= 47) || (temp >= 58 && temp <= 64) || (temp >= 91 && temp <= 96)
						|| (temp >= 123 && temp <= 126)) {

					// 추가 요구사항 처리
					if (temp == 60 || temp == 62 || temp == 40 || temp == 41 || temp == 59 || temp == 37 || temp == 124
							|| temp == 32)
						isUseless = true;
					else
						symbol_cnt++;
				}
			}

			// 추가 요구사항 : 사용할 수 없는 기호 (>, <, (, ), ;, %, \, 공백) 추가해보세요. nextLine() 메소드로
			// 변경합니다.

			System.out.println("대문자 개수 : " + upper_cnt);
			System.out.println("소문자 개수 : " + lower_cnt);
			System.out.println("숫자 개수 : " + numeric_cnt);
			System.out.println("기호 개수 : " + symbol_cnt);

			if (symbol_cnt < 1)
				message += "*) 특수문자 1개 이상 포함\n";

			if (upper_cnt < 1)
				message += "*) 영문 대문자 1개 이상 포함\n";

			if (lower_cnt < 1)
				message += "*) 영문 소문자 1개 이상 포함\n";

			if (numeric_cnt < 1)
				message += "*) 숫자 1개 이상 포함\n";

			if (isUseless)
				message += "*) 사용할 수 없는 기호  > < ( ) ; % \\ 공백 이 있습니다.\n";

			if (pw.length() >= 8 && upper_cnt >= 1 && lower_cnt >= 1 && numeric_cnt >= 1 && symbol_cnt >= 1
					&& !isUseless)
				isOk = true;

			System.out.println(message);
			System.out.println("결과 : " + (isOk ? "사용할 수 있는 패스워드 입니다." : "패스워드 작성 규칙에 맞지 않습니다."));
			// isOk 참일때 : 앞에 문자열 출력, 거짓이면 : 뒤에 문자열 출력

		} 	// while end
		
		System.out.println("사용할 패스워드 : " + pw);
		sc.close();
	}

	// 불필요한 변수 사용은 줄입시다.
	// 반복되는 코드도 없도록 합시다.
	// 다른 사람이 이해하기 쉬운 코드로 작성합니다.

}
