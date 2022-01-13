package koreait.day10.practice;

public class MyRedPen {
	
	private boolean correct;
	private String question;
	private int ans;
	
	public MyRedPen(String question, int ans) {
		this.question = question;
		this.ans = ans;		
	}
	
	public boolean isCorrect() {
		return correct;
	}
	public void setCorrect(boolean correct) {
		this.correct = correct;
	}
	
	public String getQuestion() {
		return question;
	}
	
	public int getAns() {
		return ans;
	}
	
}
