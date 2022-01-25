package koreait.day19;

public class WordNoteApp {

	public static void main(String[] args) {
		
//		EnglishKoreanNote eng_kor = new EnglishKoreanNote();
		WordNote eng_kor = new EnglishKoreanNote();
		
		eng_kor.start();		// 오류 : WordNote에는 start메소드가 없기 때문		=> WordNote에 디폴트메소드 생성
		
	}

}
