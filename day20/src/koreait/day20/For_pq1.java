package koreait.day20;

import java.util.Random;

public class For_pq1 {

	public static void main(String[] args) {
		Random r = new Random();
		
		int num = r.nextInt(10)+1;
		int result = num;
		System.out.println("num = " + num);
		for (num = num - 1; num > 0; num--) {
			result *= num;
		}
		System.out.println("result = " + result);
		
	}

}
