package koreait.day12;

import java.util.ArrayList;

public class MemberArrayList {

	public static void main(String[] args) {
		Member[] members = new Member[10]; 	// 배열 10개 요소에 Member 객체를 참조시킴
		
		// ArrayList에 클래스 타입 객체 추가하기
		ArrayList<Member> mlist = new ArrayList<>();
		
		Member momo = new Member();		// momo변수는 객체의 주소를 저장
		mlist.add(momo);				// 그 주소를 mlist에 추가
		momo.id = 20221234;		momo.name = "이모모";
		System.out.println("momo = " + momo);					// momo 변수와
		System.out.println("mlist(0) = " + mlist.get(0)); 		// mlist.get(0) 요소에 저장된 값은 같다? vs 다르다? -> 같다
		mlist.add(new Member(20221111, "사나"));
		mlist.add(new Member(20210111, "미나"));
		mlist.add(new Member(20201234, "쯔위"));
		
		for (int i = 0; i < mlist.size(); i++) {
			Member temp = mlist.get(i);
			System.out.println("index = " + i + ", element = " + temp);
		}
		
		mlist.add(1, new Member(19990111, "나연"));	// 이모모, 나연, 사나, 미나, 쯔위
		mlist.remove(3);							// // 이모모, 나연, 사나, 쯔위
		
		System.out.println("------------------------------------");
		for (int i = 0; i < mlist.size(); i++) {
			System.out.println("index = " + i + ", element = " + mlist.get(i));
		}
		
		mlist.remove(momo);		// 객체의 참조값을 전달하여 삭제합니다. 인자타입이 Object일 때 입니다.
		System.out.println("------------------------------------");
		for ( Member temp : mlist) {		// 변수 i를 사용 안할때, 빠른(향상된) for문 - for( 요소타입선언 변수명 : 리스트 또는 배열변수명
			System.out.println("element = " + temp);
		}
		
		// ArrayList는 요소의 추가/삭제가 쉽습니다.
	}

}
