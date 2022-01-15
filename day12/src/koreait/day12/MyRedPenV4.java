package koreait.day12;

import java.util.ArrayList;
import java.util.Scanner;

public class MyRedPenV4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("---------------------------------------");
			System.out.println("빨간펜 수학 2자리 덧셈 문제 풀기");
			System.out.println("---------------------------------------");
			System.out.println("시작합니다.");

			ArrayList<MathProblem> addList = new ArrayList<>();
			int correct = 0;

			for (int i = 1; i <= 10; i++) {
				MathProblem mp = new MathProblem('+');
				mp.makeProblem();
				
				System.out.print("문제 " + i + ".\t" + mp + "\t 답 입력 ->");
				
				int ans = sc.nextInt();
				mp.setAns(ans);
				
				if (ans == mp.showAnswer()) {
					correct++;
					mp.setCorrect(true);
				}
				addList.add(mp);
			}

			System.out.println("---------------------------------------");
			System.out.println("채점 합니다. 맞은 갯수 : " + correct + "개 (" + correct * 10 + "점)");
			System.out.println("::::: 틀린 문제 보기 ::::::");
			
			for (MathProblem prob : addList) {
				if (!prob.isCorrect())
					System.out.println("문제 : " + prob  + ", 정답 : " + prob.showAnswer()
							+ ", 적은 답 : " + prob.getAns());
			}

			System.out.println("계속하시겠습니까? (계속 풀기 : 0, 종료 : 아무 숫자)");
		} while (sc.nextInt() == 0);
		// 계속할까요? -> 연산자를 선택할 수 있도록 기능 추가해서 V4 완성
		sc.close();
	}

}
