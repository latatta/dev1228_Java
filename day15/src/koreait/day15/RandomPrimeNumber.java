package koreait.day15;

import java.util.Arrays;
import java.util.Random;

public class RandomPrimeNumber {

	public static void main(String[] args) {
		// 주어진 난소 범위에서 소수가 7개 만듭니다. 소수 7개는 배열에 저장하여 출력합니다.
		// -> 주어진 점수값이 소수인지 판별하는 메소드를 만들어 봅시다.(메소드 이름 isPrime, 리턴형식 boolean, 인자 int 1개)
		Random r = new Random();
		
		long start = System.currentTimeMillis();		// 현재 시간을 ms(0.001초) 단위로 가져옵니다. 형식은 long

		int[] primeArr = new int[7];
		int cnt = 0, max = 99999, min = 100;
		int num;

		while (true) {
			num = r.nextInt(max-min+1) + min;
			if (isPrime(num)) {
				primeArr[cnt] = num;
				cnt++;
			}

			if (cnt == 7)	break;
		}
		System.out.println(Arrays.toString(primeArr));
		long end = System.currentTimeMillis();
		System.out.println("실행시간 : " + (end-start) + "ms 소요되었습니다.");
	}

	static boolean isPrime(int num) {
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}
