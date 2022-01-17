package koreait.day13;

public class ASquare extends AShape{

	private int width;
	
	// 테스트용 메소드
	public String square() {
		return "square - 정사각형";
	}
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width*width;
	}
	
	public int getWidth() {
		return width;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
}
