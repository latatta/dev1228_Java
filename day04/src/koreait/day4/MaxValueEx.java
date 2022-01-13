package koreait.day4;

import java.util.Scanner;

public class MaxValueEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("i = ");
		int i = sc.nextInt();
		System.out.print("l = ");
		int l = sc.nextInt();
		System.out.print("m = ");
		int m = sc.nextInt();
		
		sc.close();
		
		if (i == l && m == i)
			System.out.println("세 숫자는 모두 같은 숫자이다.");
		else if (i == l) {
			if (l > m) 
				System.out.println("i와 l은 최댓값이다.");
			else
				System.out.println("m은 최댓값이다.");
		} else if (i == m) {
			if (i > l) 
				System.out.println("i와 m은 최댓값이다.");
			else
				System.out.println("l은 최댓값이다.");
		}  else if (l == m) {
			if (l > i) 
				System.out.println("l과 m은 최댓값이다.");
			else
				System.out.println("i는 최댓값이다.");
		} else {
			if (i > m && i > l) 
				System.out.println("i는 최댓값이다.");
			else if (m > i && m > l)
				System.out.println("m은 최댓값이다.");
			else
				System.out.println("l은 최댓값이다.");
		}
	}

}
