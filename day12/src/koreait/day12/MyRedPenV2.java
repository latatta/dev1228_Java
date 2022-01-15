package koreait.day12;

import java.util.Scanner;

public class MyRedPenV2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char op;
		do {
			System.out.print("연산 입력 -> ");
			op = sc.nextLine().charAt(0); // charAt(0) 메소드로 입력받은 문자열의 첫번째 문자를 저장
			
			if (op == '0') {		// 종료조건 먼저 검사합니다.
			System.out.println("프로그램을 종료합니다.!!!");
			// do~while 아니고 while(true) 반복문이면 이 자리에 break; 사용
			
			} else if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("잘못된 선택입니다.");
				continue;

			} else {	// op는 '+', '-', '*', '/' 중 하나일 때만 해당
				MathProblem p1 = new MathProblem(op);
				p1.makeProblem();
				//p1.print();
				System.out.println(p1);		// toString 재정의 적용한 예제
				System.out.println("정답 : " + p1.showAnswer());
			}

		} while (op != '0');

		sc.close();
		// 참고 : System.gc(); 	// 사용되지 않는 객체등 메모리 공간 정리를 위해 가비지 콜렉터 실행
		System.gc(); 
		System.out.println("::::: The End :::::");

	}

}
