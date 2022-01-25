package koreait.day18;

public class StudentScore {
	private int num;
	private String name;
	private int korean;
	private int english;
	private int science;

	public StudentScore(int num, int korean, int english, int science) {
		this.english = english;
		this.korean = korean;
		this.num = num;
		this.science = science;
	}

	// StringTokenizer 예제용 생성자
	public StudentScore(String name, int korean, int english, int science) {
		this.english = english;
		this.korean = korean;
		this.name = name;
		this.science = science;
	}

	// 문제 1) toString 메소드 재정의 하세요. (참고 : 실행화면)
	@Override
	public String toString() {
		return "[번호 : " + num + "  이름 : " + name + "]  국어 : " + korean + "  영어 : " + english + "  과학 : " + science;
	}

	int sum() {
		return (korean + english + science);
	}

	double avg() {
		return (double) sum() / 3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEnglish() {
		return english;
	}

	public int getKorean() {
		return korean;
	}

	public int getScience() {
		return science;
	}
}
