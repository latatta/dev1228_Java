package koreait.day7;

import java.util.Scanner;

public class EvenOddStringV1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String src_string, even_string = "", odd_string = "";
		
		System.out.print("문자열(공백과 기호, 숫자 포함)을 입력하세요. ->");
		src_string = sc.nextLine();
			
		for (int i = 0; i < src_string.length(); i++) {
			if (i % 2 == 0) even_string += src_string.charAt(i);		// 문자열 연결
			else odd_string += src_string.charAt(i);
		}
			
		System.out.println("[[결과]]");
		System.out.println("짝수 문자열 :" + even_string);
		System.out.println("홀수 문자열 :" + odd_string);
		
		sc.close();
	}
}

// even_string 변화과정 : "" -> "t" -> "ti" -> "tie" -> "tieo" -> ...
// 이 방법은 메모리를 많이 차지하므로 효율적인 방법이 아님
// 연결연산자는 가급적 피하는것이 좋음