package koreait.day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MyRedPenV4 {
	// 46 ~ 58 라인 추가 : 틀린 문제를 배열에 저장하고 파일쓰기 합니다.(MyFileRW.java 클래스 사용)
	
	
	static ArrayList<MathProblem> addList;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("----------------------------------------------");
		System.out.println("빨간펜 수학 2자리 + - x ÷ 연산문제 풀기");
		System.out.println("----------------------------------------------");
		char op;
		while (true) {
			int cnt = 0;
			int ans;
			// 2)
			addList = new ArrayList<>();
			System.out.print("어떤 문제를 내줄까요? 연산입력 (✔끝내려면 0 입력) -> ");
			op = sc.nextLine().charAt(0); // charAt(0) 메소드로 입력받은 문자열의 첫번쨰 문자를 저장합니다.

			if (op == '0') { // 종료조건을 먼저 검사합니다.
				System.out.println("프로그램을 종료합니다.!!!");
				// 3)
				break;
			} else if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("잘못된 선택입니다.");
				continue;
			} else { // op는 '+' , '-' , '*' , '/' 중 하나일때만 해당됩니다.
				System.out.println("시작합니다." + op + " 연산 문제 입니다.");
				System.out.print("원하는 문제 갯수 입력하세요. (5 or 10 or 20) -> ");
				int num = sc.nextInt();

				// 메소드 호출
				cnt = start(num, op);

				System.out.println("----------------------------------------------");
//				System.out.println("채점 합니다. 맞은 갯수  "+ cnt + " ( " + (//4)  수식    ) +" 점)");
				System.out.println("채점 합니다. 맞은 갯수  " + cnt + " ( " + ((100 / num) * cnt) + " 점)");
				System.out.println("::::: 틀린문제 다시보기 :::::");

				// ArrayList를 배열로 변환하는 방법
				MathProblem[] maths = new MathProblem[num - cnt];

				int i = 0;
				for (MathProblem prob : addList) {
					if (!prob.isCorrect()) {
						maths[i++] = prob;
					}
					System.out.println(Arrays.toString(maths));
				}
				// 틀린문제를 파일에 출력하기 : 파일명 yourmath.txt
				MyFileRW.fileWrite("c:\\dev\\test\\yourmath.txt", maths);
				
			}
			sc.nextLine(); // ans = sc.nextInt(); 의 마지막 엔터를 입력버퍼에서 가져오기
							// sc.nextInt(); 메소드 실행의 엔터는 다음 sc.nextLine() 메소드에서 가져갑니다.
							// 이 메소드가 없으면 sc.nextLine().charAt(0) 에서 가져가므로 엔터가 입력되므로 오류가 생김
		}
		;

		System.out.println("::::: The End :::::");
		sc.close();
	}

	// 메소드를 만들어서 수정합니다. 메소드는 코드 재사용과 가독성을 위해 필요합니다.
	static int start(int num, char op) { // num은 문자 개수, op는 연산자, 리턴 int는 맞은 개수
		int cnt = 0;
		int ans;

		for (int i = 0; i < num; i++) {
			MathProblem p1 = new MathProblem(op);
			addList.add(p1);
			p1.makeProblem(); // 문제 만드는 메소드 : 연산종류에 따라 숫자가 다른범위 난수로 만들어집니다.
			System.out.print("문제 " + (i + 1) + ".  " + p1 + " 답 입력 -> ");
			ans = sc.nextInt();
			if (ans == p1.showAnswer()) {
				cnt++;
				p1.setCorrect(true);
			}
		} // for end

		return cnt;
	}

}
