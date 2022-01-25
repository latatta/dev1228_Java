package koreait.day19;

public interface WordNote {

	// public abstract 생략
	void wordAdd();
	void wordList();
	void wordSave(String filename);
	void wordRead(String filename);
	
	// 디폴드 메소드 (인스턴스 메소드)	: 이미 여러개의 클래스가 WordNote 인터페이스를 구현한 상황이라면 새로운 추상 메소드를 추가하면 오류 발생. 
	//							해결방법 중 하나가 default 메소드를 정의하고 클래스가 오버라이드 하도록 하는 것입니다. 
	default void start() {
		
	}
}
