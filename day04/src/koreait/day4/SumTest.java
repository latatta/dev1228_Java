package koreait.day4;

public class SumTest {

	public static void main(String[] args) {	// for문을 이용하여 1부터 100까지 합계

		int sum = 0;	// 반드시 초기화 필요
		
		for (int i = 1; i <= 100; i++) {
//			sum = sum + i;
			sum += i;
			System.out.println("i = " + i + ", sum = " + sum);
		}
		
		System.out.println("sum = " + sum);		// 최종값
		
			
		
	}

}
