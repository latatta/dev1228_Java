package koreait.day5;

import java.util.Scanner;

public class MaxMinValueEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		int max;
		int min;
		
		System.out.println("n1, n2, n3에 저장할 값 3개를 입력하세요.");
		System.out.print("n1 -> ");
		n1 = sc.nextInt();
		System.out.print("n2 -> ");
		n2 = sc.nextInt();
		System.out.print("n3 -> ");
		n3 = sc.nextInt();
		
		sc.close();
		
		// 최댓값 구하기
		if (n1 > n2) 
			max = n1;
		else 
			max = n2;
		
		if (max < n3)
			max = n3;
		
		// 최소값 구하기
		if (n1 < n2)
			min = n1;
		else
			min = n2;
		
		if (min > n3)
			min = n3;
		
		System.out.println("최댓값 = " + max);
		System.out.println("최소값 = " + min);
		
		// 조건연산자 (3항연산)으로 변경하면 대입문에서는 다음과 같습니다.
		max = (n1>n2)? n1:n2;
		min = (n1>n2)? n2:n1;
		max = (max<n3)? n3:max;
		min = (min>n3)? n3:max;
		
	}

}
