package ex6.capsule3.covid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Program3MultiArray4 {

	private static Scanner newScanner(String path, String encodingType) throws IOException, IOException {
		return new Scanner(new InputStreamReader(new FileInputStream(path), encodingType));
	}

	private static int getCount(Scanner sc) {
		int count = 0;
		while (sc.hasNextLine()) {
			sc.nextLine();
			count++;
		} // end while loop
		System.out.println(count);
		return count;
	}

	private static void printCovid19List(int count, String[][] rows) {
		for (int i = 0; i < count; i++) {
			for (int j = 0; j < rows[i].length; j++) {
				System.out.printf("%s", rows[i][j]);
				if (j < 9)
					System.out.print(",");
				else
					System.out.println();
			} // end for loop
		} // end for loop
	}// end method

	private static int getTotal(String[][] rows, int count, int tgtIdx, String[] title) {
		int total = 0;
		for (int i = 0; i < count; i++)
			total += Integer.parseInt(rows[i][tgtIdx]);
		System.out.printf("%s : %d", title[tgtIdx], total);
		return total;
	}

	private static void printMaxTest(int count, String[][] rows) {
		int max = getMax(count, rows);
		System.out.printf("가장 많은 검사 진행 수 : %d", max);
	} // end method

	private static int getMax(int count, String[][] rows) {
		int max = 0;
		int current;
		String date = getDate(count, rows);

		for (int i = 0; i < count; i++) {
			current = Integer.parseInt(rows[i][3]);
			if (max < current) {
				max = current;
			} // end if
		} // end for loop
		System.out.printf("날짜 : %s\n", date);
		return max;
	}

	private static String getDate(int count, String[][] rows) {
		int max = 0;
		int current;
		String date = "";
		for (int i = 0; i < count; i++) {
			current = Integer.parseInt(rows[i][3]);
			if (max < current) {
				max = current;
				date = rows[i][0];
			} // end if
		} // end for loop
		return date;
	}

	private static void printIncreasedData(int count, String[][] rows) {
		System.out.println("확진자 수가 늘어난 일자와 수를 출력하시오.");
		int prev = Integer.parseInt(rows[0][1]);
		int curr = 0;
		int diff = 0;
		String currentDate = "";
		int seq = 0;
		for (int i = 1; i < count; i++) {
			curr = Integer.parseInt(rows[i][1]);
			diff = curr - prev;
			if (diff > 0) {
				currentDate = rows[i][0];
				System.out.printf("%d : %s, %d\n", ++seq, currentDate, diff);
			} // end if
			prev = curr;
			diff = 0;
		} // end scope
	} // end method

	private static String[][] load(Scanner sc, String[][] rows, int count, String[] title) {
		rows = new String[count][];
		// 배열 데이터 삽입
		title = sc.nextLine().split(",");
		for (int i = 0; i < count; i++) {
			rows[i] = sc.nextLine().split(",");
		} // end for loop
		return rows;
	}

	private static String[] load(Scanner sc, String[] title, int count) {
		title = sc.nextLine().split(",");
		return title;
	}

	private static int getResultCount(String[][] rows, int count) {
		int resultCount = 0;
		int prev = Integer.parseInt(rows[0][1]);
		int curr = 0;
		int diff = 0;
		String currentDate = "";
		int seq = 0;
		for (int i = 1; i < count; i++) {
			curr = Integer.parseInt(rows[i][1]);
			diff = curr - prev;
			if (diff > 0) {
				resultCount++;
			}
			// end if
			prev = curr;
			diff = 0;
		} // end for loop
		System.out.println("resultCount : " + resultCount);
		return resultCount;
	}

	private static String[][] createResult(String[][] rows, int count, int resultCount) {
		int prev = Integer.parseInt(rows[0][1]);
		int curr = 0;
		int diff = 0;

		String result[][] = new String[resultCount][];

		int index = 0;
		for (int i = 1; i < count; i++) {
			curr = Integer.parseInt(rows[i][1]);
			diff = curr - prev;
			if (diff > 0) {
				// 코로나19 데이터 행을 저장하기 위한 배열
				String[] data = new String[2];
				data[0] = rows[i][0];
				data[1] = String.valueOf(diff);
				result[index++] = data;
			} // end if
			prev = curr;
			diff = 0;
		} // end loop

		return result;
	}
	
	private static void printResult(String[][] result) {
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%s ", result[i][j]);
				if (j == 1)
					System.out.println();
			} // end loop
		} // end loop
	}

	public static void main(String[] args) throws IOException, FileNotFoundException {
		// 초기 선언
		String path = "res/제주특별자치도_코로나현황_20201214.csv";
		String encodingType = "euc-kr";
		Scanner sc;
		String[] title = null;
		String[][] rows = null;

		// 파일 전체 라인수 가져오기
		sc = newScanner(path, encodingType);
		sc.nextLine();
		int count = getCount(sc);

		// 타이틀 가져오기
		sc = newScanner(path, encodingType);
		title = load(sc, title, count);

		// 데이터 가져오기
		sc = newScanner(path, encodingType);
		rows = load(sc, rows, count, title);

		// 스캐너 종료
		sc.close();
		
		// 제목 출력
		for(int i = 0; i < title.length; i++) {
			System.out.print(title[i]+" ");
		}

		// 데이터 출력
		printCovid19List(count, rows);

		// 원하는 데이터 총합 출력
		int tgtIdx = 3;
		int total = getTotal(rows, count, tgtIdx, title);

		System.out.println("\n===================================");

		// 일별 가장 많은 검사 진행수는?
		printMaxTest(count, rows);
		System.out.println("\n===================================");

		// 확진자 수가 늘어난 일자와 수를 출력하시오.
		printIncreasedData(count, rows);

		// 확진자 수가 늘어난 일자와 수를 다음 배열에 담아주시오.
		System.out.println("====================================");
		System.out.println("확진자 수가 늘어난 일자와 수를 다음 배열에 담아주시오.");
		int resultCount = getResultCount(rows, count);
		String[][] result = createResult(rows, count, resultCount);
		
		System.out.println("==========================");
		printResult(result);
		
	}

	

}
