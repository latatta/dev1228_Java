package koreait.day6;

public class StudentScoreTest {

	public static void main(String[] args) {
		// 작성자 : 정세은
		
		StudentScore std1 = new StudentScore();
		std1.name = "James";
		std1.num = 213;
		std1.korean= 99;
		std1.english = 87;
		std1.science = 58;
		int std1_sum = std1.sum();
		double std1_avg = std1.avg();
		
		std1.printScore();
		System.out.println("총점수 : " + std1_sum);
		System.out.printf("평균점수 : %.2f\n", std1_avg);
		System.out.println("=============================");
		
		StudentScore std2 = new StudentScore();
		std2.name = "Sarah";
		std2.num = 13456;
		std2.korean= 64;
		std2.english = 73;
		std2.science = 74;
		int std2_sum = std2.sum();
		double std2_avg = std2.avg();
		
		std2.printScore();
		System.out.println("총점수 : " + std2_sum);
		System.out.printf("평균점수 : %.2f\n", std2_avg);
		System.out.println("=============================");
		
	}

}
