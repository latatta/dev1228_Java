package koreait.day7;

import java.util.Scanner;

public class UpperLowerString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String message, upper, lower;
		int k = 0;
		int j = 0;
		
		boolean eng = false;

		char[] uppers = new char[20];
		char[] lowers = new char[20];

		while (!eng) {
			System.out.print("영어 문자열을 입력하세요. -> ");
			message = sc.nextLine();
				
			
			for (int i = 0; i < message.length(); i++) {
				if (message.charAt(i) >= 'A' && message.charAt(i) <= 'Z') {
					uppers[k] = message.charAt(i);
					k++;
					eng = true;
					
				} else if (message.charAt(i) >= 'a' && message.charAt(i) <= 'z') {
					lowers[j] = message.charAt(i);
					j++;
					eng = true;
					
				} else {
					System.out.println("영어 문자열이 아닙니다.");
					break;					
				}
				
			}
		}
		
		sc.close();
		
		upper = String.copyValueOf(uppers);
		lower = String.copyValueOf(lowers);		
		
		System.out.println("[[결과]]");
		System.out.println("대문자 문자열 : " + upper);
		System.out.println("소문자 문자열 : " + lower);
		
	}

}
