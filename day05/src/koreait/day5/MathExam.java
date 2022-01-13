package koreait.day5;

import java.util.Scanner;

public class MathExam {
	// 작성자 : 정세은. (2022/01/04)

	public static void main(String[] args) {

		System.out.println("[[ 수학 공부 도우미 ]]");
		System.out.println("1. 덧셈\t2. 뺄셈\t3. 곱셈\t4. 종료");
		Scanner sc = new Scanner(System.in);

		int select, n1, n2;
		int result = 0;

		while (true) {
			System.out.print("연산을 선택하세요. -> ");
			select = sc.nextInt();

			if (select == 4)
				break;
			
			else if (select > 4 || select < 1)
				System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
			
			else {
				System.out.print("✏️  값 1 을 입력하세요. -> ");
				n1 = sc.nextInt();
				System.out.print("✏️  값 2 을 입력하세요. -> ");
				n2 = sc.nextInt();

				if (select == 1) {
					result = n1 + n2;
					System.out.printf("정답 : %d + %d = %d 입니다.\n", n1, n2, result);

				} else if (select == 2) {
					result = n1 - n2;
					System.out.printf("정답 : %d - %d = %d 입니다.\n", n1, n2, result);

				} else if (select == 3) {
					result = n1 * n2;
					System.out.printf("정답 : %d * %d = %d 입니다.\n", n1, n2, result);

				}

			}
		}

		sc.close();

		System.out.println("프로그램을 종료합니다.Bye,,👍👍");

	}

}
