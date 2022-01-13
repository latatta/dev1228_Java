package koreait.day11;

public class Puppy extends Animal {

	private String type;

	// 생성자 생략 가능 - default 생성자 super() 호출합니다.

	public void setType(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}

	@Override	// @ 어노테이션은 명령실행에 도움을 주는 주석입니다.
	public void sound() {
//		super.sound();		// Animal 클래스에서 정의한 내용
		System.out.println("🐶🐶🐶 멍멍");
	}
	
}
