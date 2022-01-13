package practice_questions;

import java.util.Scanner;

public class ConnectDifferentStrings {

	public static void main(String[] args) {
		// 문자열 2개를 입력받아서 1개로 만듭니다.-> EvenOddString 예제의 반대로 처리합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수 인덱스에 들어갈 문자열  입력 ->");
		String odd_str = sc.nextLine();
		System.out.print("짝수 인덱스에 들어갈 문자열  입력 ->");
		String even_str = sc.nextLine();
		int total_length = even_str.length() + odd_str.length();
		String total_str;
		
		char[] total = new char[total_length];
		
		for (int i = 0; i < total_length; i++) {
			if (i % 2 == 0) total[i] = even_str.charAt(i/2);
			else total[i] = odd_str.charAt(i/2);
			
		}
		
		total_str = String.copyValueOf(total);
		
		System.out.println("홀수 인덱스에 들어갈 문자열 : " + odd_str);
		System.out.println("짝수 인덱스에 들어갈 문자열 : " + even_str);
		System.out.println("합한 문자열 : " + total_str);
		
		sc.close();
	}

}
