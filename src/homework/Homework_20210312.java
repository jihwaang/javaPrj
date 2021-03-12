package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Homework_20210312 {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv"), "euc-kr"));

		String[] firstLine = sc.nextLine().split(",");
		int sums[] = new int[firstLine.length];
		
		while (sc.hasNextLine()) {
			String eachLineData = sc.nextLine();
			String[] data = eachLineData.split(",");
			// 각각의 수 합계
			for (int i = 0; i < data.length; i++) {
				if (i == 0 || i == data.length - 1) 
					continue;
				sums[i] += Integer.parseInt(data[i]);
			}
		}

		System.out.println("원하시는 합계의 번호를 입력해주세요.");
		System.out.println("---------------------------");
		for (int i = 0; i < firstLine.length; i++) {
			if (i == 0 || i == firstLine.length - 1)
				continue;
			System.out.printf("[%d] %s\n", i, firstLine[i]);
		}
		System.out.println("---------------------------");
		
		sc.close();
		sc = new Scanner(System.in);
		
		int idx = Integer.parseInt(sc.nextLine());
		
		while(!(0<idx && idx < 9)) {
			System.out.println("범위에 없는 번호입니다.\n다시입력해주세요.");
			idx = Integer.parseInt(sc.nextLine());
		}
		System.out.printf("%s 합계 : %d\n", firstLine[idx], sums[idx]);
		
		sc.close();
	}

}
