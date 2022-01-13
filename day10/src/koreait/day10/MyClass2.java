package koreait.day10;

public class MyClass2 {
	// 접근 권한 연습
	private int age;		// private	: 다른 클래스에서 접근 불가. 나만 쓰겠다
	String name;			// default(package)	: 다른 패키지에서 사용 불가. 이웃이면 같이 쓰자
	public int score;		// public	: 어디서나 사용 가능. 다같이 쓰자
		
	// 생성자 메소드 : public, default에 따라 접근권한이 설정됨
	// 초기 접근권한은 public
/*	MyClass2() {
		// 이렇게 수정하면 다른 패키지에서 객체 생성 불가
	} 
*/
	
}
