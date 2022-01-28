package koreait.day20;

import java.util.ArrayList;
import java.util.List;

public class For_pq2 {

	public static void main(String[] args) {
		int num = 100;
		List<Integer> lst = new ArrayList<>();
				
		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				lst.add(i);
			}
		}
		System.out.println(lst);
	}

}
