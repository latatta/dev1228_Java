package koreait.day15;

public class MyFiileRWTest {

	public static void main(String[] args) {
		MyFileRW.fileRead("c:\\dev\\test\\자바테스트.txt");
		MyFileRW.fileRead("c:\\dev\\test\\directx.log");
		
		String[] menu = {"삼겹살", "스파게티", "곱창전골", "불고기", "탕수육"};
		Member[] members = {new Member("모모", 17), new Member("사나", 21), null, null, null};
		System.out.println(members.length);
		members[2] = new Member("쯔위", 22);
		members[3] = new Member("나연", 19);
		members[4] = new Member("다현", 18);
		
		MyFileRW.fileWrite("c:\\dev\\test\\menu.txt", menu);
		MyFileRW.fileRead("c:\\dev\\test\\menu.txt");
		MyFileRW.fileWrite("c:\\dev\\test\\members.txt", members);		// 같은 파일일 때는 덮어쓰기
		MyFileRW.fileRead("c:\\dev\\test\\members.txt");
			
	}

}
