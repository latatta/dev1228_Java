package koreait.day8;

public class StringMethod1 {
	// charAt(), length()는 지난 시간에 연습했습니다.
	
	public static void main(String[] args) {
		
		String msg = "hello, JAVA";
		String temp;
		
		// 1. 대소문자 변환 메소드
		temp = msg.toUpperCase();
		System.out.println("대문자 변환 결과 : " + temp);		// "HELLO, JAVA" 변환된 문쟈열을 메모리에 저장, 주소값은 temp에 저장
		System.out.println("원본 메세지 : " + msg);
		
		temp = msg.toLowerCase();
		System.out.println("소문자 변환 결과 : " + temp);
		System.out.println("원본 메세지 : " + msg);
		
		msg = "  hi~  ";		// msg 변수값이 다른 문자열을 참조.(새로운 문자열의 주소를 저장)
		System.out.println("원본 msg : " + msg);
		
		// 예를 들면, 아이디 입력할 때 포함된 공백을 제거하는 용도로 사용
		// 2. 공백 제거
		temp = msg.trim();
		System.out.println("trim 결과 : " + temp);
		
		// 3. 특정문자열 포함 여부
		msg = "koreait.2021@gmail.com";
		System.out.println("contain 메소드 결과 : " + msg.contains("gmail"));
		System.out.println("contain 메소드 결과 : " + msg.contains("naver"));
		
		// 4. 전체 문자열이 동일한지 비교
		msg = "momo";
		System.out.println("equals 비교 : " + msg.equals("Momo"));
		System.out.println("equals 비교 : " + msg.equals("momo"));
		
		// 5. 문자열에 ==로 비교 결과 : 주소 비교입니다.
		String t1 = "test", t2 = "java";
		String t3 = new String("test");		// String 객체를 생성하고 문자열을 "test"
		String t4 = "test";
		
		System.out.println("t1 == t2 : " + (t1 == t2));		// 각각 내용이 다른 문자열 비교 -> 주소값이 다름
		System.out.println("t1 == t3 : " + (t1 == t3));		// t3은 new 연산으로 만들어진 객체를 참조 -> t1과는 다른 새로운 객체를 만들어서 저장한 것이므로 주소가 다름
		System.out.println("t1 == t4 : " + (t1 == t4));		// 문자열 내용이 같으면 -> 한번만 메모리에 저장.
		
		
		
	}

}
