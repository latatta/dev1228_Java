package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadTest {

	// System.in : 표준입력(콘솔/키보드 입력) 지금까지 입력은 표준입력. 이제는 파일입력 연습.

	public static void main(String[] args) {

		// 파일입력 : 데이터를 파일에서 읽어옵니다.
		String filename = "C:\\dev\\test\\자바테스트.txt"; // 역슬래쉬 \는 \\로 해야 합니다.

		// 파일객체 생성
		File file = new File(filename);

		// file 변수가 참조하는 File 클랙스 객체를 데이터 입력에 사용하기 위한 클래스는  Scanner 입니다.
		try {
			Scanner fsc = new Scanner(file);
			
/*			String temp = fsc.nextLine();
			System.out.println("읽어온 문자열 : " + temp);		*/
			System.out.println("===================================");
			
			// hasxxxx() 메소드 : 다음 토큰(구분기호로 분리)이 있는지 체크
			// hasNextLine() : 토큰이 엔터일때 있는지 체크
			while(fsc.hasNext()) {	   // 읽어올 라인이 있다면 반복
				System.out.println(fsc.nextLine());
			}
			fsc.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
