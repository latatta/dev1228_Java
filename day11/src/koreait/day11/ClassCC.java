package koreait.day11;

public class ClassCC {
	int cc; // 자식클래스만의 필드

/*	
 * public ClassCC(int ab) {
		super(ab);		// 부모클래스의 생성자 호출 : 오류
	}
*/
	public ClassCC(int cc) {
		this.cc = cc;
	}
}

// super() : 부모클래스 생성자 ClassC() 호출
// super(c) : 	  " 	 ClassC(c) 호출