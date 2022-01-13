package koreait.day4;

import java.util.Scanner;

public class StarPrint {
	// 예제 : 영화 감상 후기 1 ~ 5 평점 입력 방법 1: 3 일때 ★★★ 방법 2 : ★★★☆☆

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int point;

		System.out.println("[[ 영화감상 후기 ]]");
		System.out.print("평점을 몇점 주시겠습니까? -> ");
		point = sc.nextInt();

		sc.close();
		
		System.out.println("방법 1");
		for (int i = 0; i < point; i++)
			System.out.print("★");

		System.out.println("\n방법 2-1");
		for (int i = 0; i < point; i++)
			System.out.print("★");
		for (int i = 0; i < (5 - point); i++)
			System.out.print("☆");

		
		System.out.println("\n방법 2-2");
		for (int i = 0; i < 5; i++)
			if (i < point) 
				System.out.print("★");
			else
				System.out.print("☆");
		// for문이 종료되면 i 변수는 사용 못합니다.
		
		
		System.out.println("\n방법 2-3");
		int k;
		for (k=0; k < point; k++)
			System.out.print("★");
		
		// 위의 for문을 종료하면 k = point
		for (;k < 5; k++) 	// 초기값 생략, k = point
			System.out.print("☆");
		
/*		for (int i = 0;; i++) 			// 조건문 x -> 무한루프(무한반복)
			System.out.print("test");
*/
		
	}

}
