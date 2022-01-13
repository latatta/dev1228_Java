package koreait.day5;

public class WhileTest {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++)			//i를 for() 안에서 선언하면 for에서만 사용할수 있습니다.
			//i는 0부터 4까지 변경되면서 실행합니다.
			System.out.println("헬로우 ! (" + i + ")");	//i=0 , 0<5 참 -> 출력 실행 -> i++
														//i=1 , 1<5 참 ->    " -> i++
														//i=2, 2<5 참 ->     "    -> i++
														//	:
														//i=5, 5<5 거짓 -> for종료

		// while 반복문
		System.out.println("\nwhile 출력 1");
		int j = 10;
		while (j<5) {
			System.out.println("헬로우! (" + j + ")");
			j++;
		}

		System.out.println("\nwhile 출력 2");
		while(true) {
			System.out.println("하이 자바 - " + j);
			j++;
			if (j==100) break;
		}
		
		System.out.println("\n while 출력 3");
		boolean isOK = true;
		while (isOK) {
			System.out.print("j = " + j);
			for (int i = 0; i < 5; i++)
				System.out.print("\t" + i);
			
			System.out.println();
			j++;
			if (j == 105)	isOK = false; 	// while 종료
			
		}
	}

}
