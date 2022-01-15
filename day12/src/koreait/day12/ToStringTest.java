package koreait.day12;

public class ToStringTest {

	public static void main(String[] args) {
		
		Member m = new Member();
		
		m.id = 20220100;
		m.name = "이모모";
//		m.print();	// 지금까지 만들었던 메소드 : 필드 출력용
		System.out.println("toString 결과 : " + m.toString());
		System.out.println("toString 생략 : " + m);	// toString은 생략 가능
		// toString 재정의 전
		// 결과 : toString 결과 : koreait.day12.Member@5aaa6d82	(패키지명.클래스명@객체구별값16진수)
		
		// toString 재정의 후
		// toString 결과 : Member [id = 20220100, name = 이모모]
		
		
		
	}

}
