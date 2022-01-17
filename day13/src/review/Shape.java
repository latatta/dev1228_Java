package review;

public class Shape {		// 상위클래스 -> 상속받을 클래스는 Triangle, Square, ...
	
	static final int MAX_WIDTH = 100;		// 변하지 않는 값. 모든 객체가 같은 값 사용(static). -> 상수
	static final int MAX_HEIGHT = 200;
	
	private String shapeName; 		// 도형 이름
	private int width;				// 도형 너비
	private int height;				// 도형 높이
	String etc = "연습용"; 		// 기타 정보 - 기본 접근자(패키지가 같은 클래스에서 사용 가능)
	protected int count = 12;		// 자식 클래스이면 어느 패키지 이던지 사용할 수 있다.
	
	// 필드 초기화 생성자 : 필드값은 생성자로만 초기화합니다. (예시 : 요구조건은 초기화된 필드값은 변경 X)
	public Shape(String shapeName, int width, int height) {
		this.shapeName = shapeName;
		this.width = width;
		this.height = height;
	}
	
	// getter 메소드만 허용(setter 허용 X)		: 예시. 요구조건은 초기화된 필드값은 변경 X
	public int getHeight() {
		return height;
	}
	
	public String getShapeName() {
		return shapeName;
	}
	
	public int getWidth() {
		return width;
	}
	
	// 넓이(면적) 를 구해서 리턴하는 메소드 : getArea
	public int getArea() {
		return width * height;
	}
	
}
