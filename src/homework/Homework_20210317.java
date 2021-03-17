package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Homework_20210317 {

	private static Scanner newScanner(String path, String encodingType) throws IOException, IOException {
		return new Scanner(new InputStreamReader(new FileInputStream(path), encodingType));
	}

	public static void main(String[] args) throws IOException {
		// 초기 선언
		String path = "res/제주특별자치도_코로나현황_20201214.csv";
		String encodingType = "euc-kr";
		Scanner sc;
		String[] title;
		String[][] rows;
		int count = 0;

		// 파일 전체 라인수 가져오기
		{
			// 스캐너 생성
			sc = newScanner(path, encodingType);
			sc.nextLine();
			while (sc.hasNextLine()) {
				sc.nextLine();
				count++;
			}
		}

		{
			// 스캐너 생성
			sc = newScanner(path, encodingType);
			// 배열 생성
			rows = new String[count][];
			// 배열 데이터 삽입
			title = sc.nextLine().split(",");
			for (int i = 0; i < count; i++) {
				rows[i] = sc.nextLine().split(",");
			}
		}

		// 스캐너 종료
		sc.close();


		String[] row;
		String[][] result;
		int resultSize = 0;
		int prev = Integer.parseInt(rows[0][1]);
		int curr;
		int diff = 0;
		int rest = 0;
		for (int i = 0; i < count; i++) {
			curr = Integer.parseInt(rows[i][1]);
			diff = curr - prev;
			if (diff > 0) {
				resultSize++;
			} // end if
			prev = curr;
		} // end loop
		
		result = new String[resultSize][];
		int idx = 0;
		for (int i = 0; i < count; i++) {
			curr = Integer.parseInt(rows[i][1]);
			diff = curr - prev;
			if (diff > 0) {
				rest = Integer.parseInt(rows[i][1]) - Integer.parseInt(rows[i][6]);
				row = new String[] { rows[i][0], Integer.toString(diff), Integer.toString(rest) };
				result[idx++] = row;
			} // end if
			prev = curr;
		} // end loop

		// result
		for (int i = 0; i < resultSize; i++) {
			for (int j = 0; j < result[i].length; j++) {
				System.out.printf("%s ", result[i][j]);
			}
			System.out.println();
		}
	}
}
