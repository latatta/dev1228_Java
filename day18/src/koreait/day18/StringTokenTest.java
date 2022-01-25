package koreait.day18;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class StringTokenTest {

	public static void main(String[] args) {
		// 예시 : StudentScore 객체가 파일에 저장되어있습니다. 하나의 문자열 "모모 90 88 79"와 같은 형태입니다.
		// -> 저장되어 있는 문자열을 파일에서 읽어서 다시 StudentScore 객체로 생성한다면
		// -> 구분기호 공백을 기준으로 데이터를 분리(토큰화)합니다. -> StringTokem 클래스 메소드 사용

		String temp = "모모 90 88 79";
		StringTokenizer stk = new StringTokenizer(temp);

		System.out.println(":: nextToken 메소드 결과 확인 ::");
		while (stk.hasMoreElements()) {
			System.out.println(stk.nextToken());
		}

		// stk객체는 hasMoreTokens()로 모든 토큰을 다 읽으면 더이상 읽을 토큰이 없을 때 거짓이 되어서 반복을 종료
		// ↓ 아래 이 코딩으로 토크나이저를 초기화 하는 것이 필요
		stk = new StringTokenizer(temp);
		System.out.println("::: 객체로 만들기 :::");
		while (stk.hasMoreTokens()) {
			StudentScore stu = new StudentScore(stk.nextToken(), Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
			System.out.println(stu);
		}

		// \t, \n, \r, \f : 공백, 탭, 줄바꿈, (-> 잘 안쓰는 기호: carriage return(커서를 맨 앞으로), form
		// feed)
		// 공백, 탭, 줄바꿈은 기본적인 구분 기호입니다.
		temp = "모모 90 88 79\n나나 92 83 91\n다현 80 87 84";
		stk = new StringTokenizer(temp);
		System.out.println(":: nextToken 메소드 결과 확인 ::");
		while (stk.hasMoreElements()) {
//			System.out.println(stk.nextToken());
			StudentScore stu = new StudentScore(stk.nextToken(), Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
			System.out.println(stu);
		}
		
		// ArrayList에 여러 객체 참조하도록 추가
		List<StudentScore> stl = new ArrayList<StudentScore>();
		
		stk = new StringTokenizer(temp);
		System.out.println(":: nextToken 메소드 결과 확인 ::");
		while (stk.hasMoreElements()) {
//			System.out.println(stk.nextToken());
			StudentScore stu = new StudentScore(stk.nextToken(), Integer.parseInt(stk.nextToken()),
					Integer.parseInt(stk.nextToken()), Integer.parseInt(stk.nextToken()));
			stl.add(stu);
		}
		System.out.println("List : " + stl);

	}

}
