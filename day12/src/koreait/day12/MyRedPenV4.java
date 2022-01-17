package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char op;

		do {
			System.out.println("어떤 문제를 연습하시겠습니까? (덧셈 : +, 뺄셈 : -, 곱셈 : *, 나눗셈 : /, 프로그램 종료 : 0)");
			op = sc.nextLine().charAt(0);
			ArrayList<MathProblem> addList = new ArrayList<>();
			int correct = 0;

			if (op == '0') { // 종료조건 먼저 검사합니다.
				System.out.println("프로그램을 종료합니다.!!!");
				// do~while 아니고 while(true) 반복문이면 이 자리에 break; 사용

			} else if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
				System.out.println("잘못된 선택입니다.");
				continue;

			} else { // op는 '+', '-', '*', '/' 중 하나일 때만 해당
				System.out.println("---------------------------------------");
				switch (op) {
				case '+':
					System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
					break;

				case '-':
					System.out.println("빨간펜 수학 2자리 뺄셈 문제 풀기");
					break;

				case '*':
					System.out.println("빨간펜 수학 2자리 곱셈 문제 풀기");
					break;

				case '/':
					System.out.println("빨간펜 수학 2자리 나눗셈 문제 풀기");
					break;
				}

				System.out.println("---------------------------------------");
				System.out.println("시작합니다.");

				for (int i = 1; i <= 10; i++) {
					MathProblem mp = new MathProblem(op);
					mp.makeProblem();
					addList.add(mp);

					System.out.print("문제 " + i + ".\t" + mp + "\t 답 입력 -> ");

					int ans = sc.nextInt();
					mp.setAns(ans);

					if (ans == mp.showAnswer()) {
						correct++;
						mp.setCorrect(true);
					}
				}

				System.out.println("---------------------------------------");
				System.out.println("채점 합니다. 맞은 갯수 : " + correct + "개 (" + correct * 10 + "점)");
				System.out.println("::::: 틀린 문제 보기 ::::::");

				for (MathProblem prob : addList) {
					if (!prob.isCorrect())
						System.out
								.println("문제 : " + prob + ", 정답 : " + prob.showAnswer() + ", 적은 답 : " + prob.getAns());
				}
			}

		} while (op != '0');

		// 계속할까요? -> 연산자를 선택할 수 있도록 기능 추가해서 V4 완성
		sc.close();
	}

}
