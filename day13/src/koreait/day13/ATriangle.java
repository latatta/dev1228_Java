package koreait.day13;

public class ATriangle extends AShape{
	// 추항클래스를 상속받으면 추상메소드가 반드시 구현되어야 합니다.
	private int height;
	private int width;
	
	@Override		// (오버라이딩보다는 implements(구현)로 불립니다.)	- 정의가 안된 메소드 를 실행내용 정의하는 것이기 때문
	public double getArea() {	
		return width*height/2;
	}
	
	// 테스트용 메소드
	public String triangle() {
		return "triangle - 삼각형";
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	
}
