package koreait.day8;

import java.util.Arrays;
import java.util.Random;

public class IntArrayTest4 {
	// IntArrayTest 첫번째 예제는 day7 프로젝트에 있습니다.
	// int값 저장하는 배열을 활용하는 연습입니다. - (2)

	public static void main(String[] args) {

		// 배열의 크기는 20 -> 메모리에 할당
		int[] scores = new int[20];

		// 배열의 값은 난수 1 ~ 100 범위값 저장
		Random r = new Random(System.currentTimeMillis()); // 난수 발생에 필요한 seed값 설정

		for (int i = 0; i < scores.length; i++) {
			scores[i] = r.nextInt(100) + 1;
		}

		System.out.println(Arrays.toString(scores));

		// ** 값의 분포 개수를 90~100, 80~89, 70~79, 69~60, 59~50, 49~40, 40 미만 범위로 출력합니다.
		// 카운트변수 4개 초기화 -> 분포가 더 다양하다면? 변수가 더 많이 필요합니다. -> cnt 변수값도 배열 사용
		int[] cnts = new int[7];

		for (int i = 0; i < scores.length; i++) {
			// scores[0], score[1], score[2], ...
			if (scores[i] < 40)
				cnts[6]++;

			else if (scores[i] < 50)
				cnts[5]++;

			else if (scores[i] < 60)
				cnts[4]++;

			else if (scores[i] <= 70)
				cnts[3]++;

			else if (scores[i] <= 80)
				cnts[2]++;

			else if (scores[i] <= 90)
				cnts[1]++;

			else
				cnts[0]++;

		}
		// 70 이상인 값의 개수 출력
		// 연습문제 : 출력을 반복문으로 수정하기 (90, 100, 80, 89 출력되는 숫자를 수식으로 표현가능?)
		System.out.println("점수 분포 요약 ------------------------");
		System.out.println("~ 39 : " + cnts[6]);
		System.out.println("40 ~ 49 : " + cnts[5]);
		System.out.println("50 ~ 59 : " + cnts[4]);
		System.out.println("60 ~ 69 : " + cnts[3]);
		System.out.println("70 ~ 79 : " + cnts[2]);
		System.out.println("80 ~ 89 : " + cnts[1]);
		System.out.println("90 ~ 100 : " + cnts[0]);
	}

}
