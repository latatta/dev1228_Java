package koreait.day7;

import java.util.Scanner;

public class CypherTest {
	// 연습예제
	// 모모와 쯔위는 암호를 푸는(해독, 복호화) key 값으로 7이라는 숫자를 정했습니다.
	// 고대암호 : 문자하나 + key = ? 새로운 문자 -> 
	public static void main(String[] args) {
		// 원본메시지 : 키보드 입력
		// 암호메시지 : cypherString을 출력합니다.
		
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String message;
		String cypherString;
		char[] temp;
		
		System.out.print("보내고싶은 원본 메세지 입력하세요. -> ");
		message = sc.nextLine();
		
		// message를 temp로 변환하여 참조합니다.
		temp = message.toCharArray();
		
		// 문자하나 + key 결과값은 temp 배열에 저장합니다.
		for (int i = 0; i < temp.length; i++) {
//			temp[i] = temp[i] + key;
			temp[i] += key;
		}
		
		System.out.println(temp);
		
		// 추가기능 : temp 문자배열을 문자열로 변환 참조.
		cypherString = String.copyValueOf(temp);
		System.out.println("암호 메세지 : " + cypherString);		// i like java -> p'sprl'qh}h
		
		sc.close();
	}

}
