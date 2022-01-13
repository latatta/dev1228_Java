package koreait.day6;

import java.util.Scanner;

public class StudentScore {
	
	int num;
	String name;
	int korean;
	int english;
	int science;
	
	void printScore() {
		System.out.println("학생 번호 : " + num);
		System.out.println("학생 이름 : " + name);
		System.out.println("국어점수 : " + korean);
		System.out.println("영어점수 : " + english);
		System.out.println("과학점수 : " + science);
	}
	
	int sum() {
		int total_sum = korean + english + science;
		return total_sum;
	}
	
	double avg() {
		double total_avg = (double)(sum() / 3);
		return total_avg;
	}
	
	//추가로 키보드 입력을 받는 메소드를 만들면 좋겠습니다.
		void inputData() {
			Scanner sc = new Scanner(System.in);
			//아직 객체가 생성되지 않은 상태이므로 클래스에서 this를 사용합니다. 
			//this는 실행할때 이 메소드를 실행하는 객체가 됩니다. 
			System.out.print("이름 ->  " );  		this.name = sc.nextLine();
			System.out.print("번호 ->  " ); 		this.num= sc.nextInt();
			System.out.print("국어 ->  " ); 		this.korean = sc.nextInt();
			System.out.print("영어 ->  " );		this.english = sc.nextInt();
			System.out.print("과학 ->  " );		this.science = sc.nextInt();
			// sc.close() -> close를 안하는 이유는 close를 하게되면 반복 입력을 할 수 없기 때문이다.
		}

}
