package koreait.day7;

import java.util.Scanner;

public class DecipherTest {

	public static void main(String[] args) {
		// 내용 : 쯔위가 모모가 보낸 암호 메세지를 받고 해독해서 확인합니다. key 약속된 7 값을 알고있습니다.
		// p'sprl'qh}h
		Scanner sc = new Scanner(System.in);
		int key = 7;
		String cypherString;
		String message;		
		char[] temp;		// char[] 배열 사용 안하고 하는 방법 있습니다.
		
		System.out.print("암호문을 입력하세요. -> ");
		cypherString = sc.nextLine();
		
		temp = cypherString.toCharArray();		// char[]배열의 주소값을 저장
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] -= key;		// message += (cypherString.charAt(i) - key) 			// 위에서 message를 초기화시켜놔야한다. String message = "";
								// "" 
								// "" + 'i' 
								// "" + 'i' + ' '
								// "" + 'i' + ' ' + 'l'
								// 		:
								// 계속 새로운 문자열이 생기면서 각각의 문자열이 메모리에 저장되기때문에 비효율적이다. -> String.copyValueOf()를 쓰는 것이 효율적
								
		}
		
		System.out.println(temp);
		
		message = String.copyValueOf(temp);
		System.out.println("해독한 메세지 : " + message);
			
		sc.close();
	}
	
	// 이 예제의 결론 : String을 char[] 배열로 변환 		~		문자열.toCharArray()
	// 			   char[] 배열을 String으로 변환		~		String.valueOf(문자배열)

}
