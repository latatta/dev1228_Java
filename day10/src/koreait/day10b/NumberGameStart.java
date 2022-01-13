package koreait.day10b;

import java.util.Arrays;
import java.util.Scanner;

public class NumberGameStart {
	// NumberGame 실행 - 게임 기록 저장
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		NumberGame[] result = new NumberGame[5]; // 게임기록 저장 최대 5번
		int i;
		int k = 0;

		System.out.println("숫자 맞추기 게임입니다.");
		System.out.print("이름을 입력하시오. -> ");
		String gamer = sc.nextLine();

		do {
			NumberGame ng = new NumberGame(gamer);
			int[] numbers = new int[10];
			System.out.println("이제 시작합니다. 나, 컴퓨터는 숫자를 결정했습니다.");
			int random = ng.makeNumber(101, 200);
			i = 0;

			do {
				System.out.println("너 휴먼 맞춰보세요. ->");
				numbers[i] = sc.nextInt();

				if (numbers[i] < random) {
					System.out.println("아닙니다. 더 큰 값입니다.");
					i++;
				} else if (random < numbers[i]) {
					System.out.println("아닙니다. 더 작은 값입니다.");
					i++;
				}

				if (i == 10)
					break;

			} while (random != numbers[i]);

			ng.setCount(i + 1);
			if (i < 10)
				ng.setSuccess(true);

			if (ng.isSuccess()) {
				System.out.println(
						"딩동댕~ 맞추셨습니다. " + ng.getCount() + "번만에 맞추셨습니다. 지금까지 시도한 값 : " + Arrays.toString(numbers));

			} else {
				System.out.println("주어진 기회를 다 쓰셨습니다. 정답은 " + random + " 입니다.");
			}

			System.out.print("게임을 계속 하시겠습니까? 계속하려면 0을 입력하세요. => ");
			result[k] = ng;
			k++;

		} while (sc.nextInt() == 0);

		System.out.println(":::: Game End ::::");

		// 게임기록 출력
		System.out.println("지금까지 한 게임들");
		for (int l = 0; l < result.length; l++) {
			
			result[l].print();
		}
	}

}
