package koreait.day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class MyFileRW {

	static void fileWrite(String filename, Object[] data) {
		File file = new File(filename);

		try {
			PrintWriter pw = new PrintWriter(file);

			for (int i = 0; i < data.length; i++) {
				pw.println(data[i]);
			}

			pw.close();
			System.out.println("파일출력이 완료되었습니다.");

		} catch (FileNotFoundException e) {
			System.out.println("없는 파일을 선택했습니다.(" + e.getMessage() + ")");
		}

	}

	static void fileRead(String filename) {

		File file = new File(filename);

		try {
			Scanner fsc = new Scanner(file);
			while (fsc.hasNext()) {
				System.out.println(fsc.nextLine());
			}
			fsc.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}
