package koreait.day15;

import java.util.Random;

public class MathProblem {

	private int n1;
	private int n2;
	private char op; // 연산자 +, -, *, /
	private boolean isCorrect;
	private int ans;

	public MathProblem(char op) {
		this.op = op;
	}
	
	public void makeProblem() {		// 사칙연산 종류별로 적절한 난수 생성 -> 문제 생성
		
		Random r = new Random();
		
		int max1 = 0, min1 = 0, max2 = 0, min2 = 0;
		
		switch (op) {
		case '+':
			max1 = 99; max2 = 99; min1 = 11; min2 = 11;
			break;
		case '-':
			max1 = 99; max2 = 49; min1 = 50; min2 = 11;
			break;
		case '*':
			max1 = 77; max2 = 29; min1 = 11; min2 = 11;
			break;
		case '/':
			max1 = 77; max2 = 29; min1 = 30; min2 = 11;
			break;
		}
		n1 = r.nextInt(max1-min1+1)+min1;
		n2 = r.nextInt(max2-min2+1)+min2;
	}
	
	public int showAnswer() {		// n1, n2, op 필드값을 가져와서 정답 보여주기
		int result = 0;
		switch (op) {
		case '+':
			result = n1 + n2;			
			break;
		case '-':
			result = n1 - n2;
			break;
		case '*':
			result = n1 * n2;
			break;
		case '/':
			result = n1 / n2;
			break;
		}
		return result;
	}

/*	public void print() {
		System.out.println(n1 + " " + op + " " + n2 + " = ");
	}
*/
	
	@Override
	public String toString() {
		return n1 + " " + op + " " + n2 + " = ";
	}

	// getter 메소드만 작성
	public int getN1() {
		return n1;
	}

	public int getN2() {
		return n2;
	}

	public char getOp() {
		return op;
	}

	public boolean isCorrect() {
		return isCorrect;
	}

	public void setCorrect(boolean isCorrect) {
		this.isCorrect = isCorrect;
	}

	public int getAns() {
		return ans;
	}

	public void setAns(int ans) {
		this.ans = ans;
	}

}
