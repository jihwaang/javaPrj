package ex3.array.test3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new InputStreamReader(new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv"), "euc-kr"));

		String[] firstLine = sc.nextLine().split(",");
		int sums[] = new int[firstLine.length];
		int sum = 0;
		
		while (sc.hasNextLine()) {
			String eachLineData = sc.nextLine();
			String[] data = eachLineData.split(",");
			// 제주 검사진행자수 합계
			sum += Integer.parseInt(data[3]);
			// 각각의 수 합계
			for (int i = 0; i < data.length; i++) {
				if (i == 0 || i == data.length - 1) 
					continue;
				sums[i] += Integer.parseInt(data[i]);
			}
		}
		// 제주 검사 진행자수 합계 출력
		//System.out.println("제주 검사 진행자수 합계 : " + sum);
		//System.out.println("----------------------------");

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
		
		/* 정답 라인 */
		// 각각의 합계 출력
//		for (int i = 0; i < firstLine.length; i++) {
//			if (i == 0 || i == firstLine.length - 1)
//				continue;
//			System.out.printf("%s 합계 : %d\n", firstLine[i], sums[i]);
//		}

		sc.close();
	}
}
