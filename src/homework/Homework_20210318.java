package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Homework_20210318 {

	private static Scanner newScanner(String path, String encodingType) throws IOException, IOException {
		return new Scanner(new InputStreamReader(new FileInputStream(path), encodingType));
	}

	public static void main(String[] args) throws IOException {
		// 초기 선언
		String path = "res/제주특별자치도_코로나현황_20201214.csv";
		String encodingType = "euc-kr";
		Scanner sc;
		String[] title;
		Covid19[] rows;
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
			rows = new Covid19[count];
			// 배열 데이터 삽입
			title = sc.nextLine().split(",");
			for (int i = 0; i < count; i++) {
				Covid19 row = new Covid19();
				row.setCovid19(sc.nextLine().split(","));
				rows[i] = row;
				//rows[i] = sc.nextLine().split(",");
			}
		}

		// 스캐너 종료
		sc.close();


		Covid19[] result;
		int resultSize = 0;
		int prev = rows[0].positiveNumber;
		int curr;
		int diff = 0;
		int rest = 0;
		for (int i = 1; i < count; i++) {
			curr = rows[i].positiveNumber;
			diff = curr - prev;
			if (diff > 0) {
				resultSize++;
			} // end if
			prev = curr;
		} // end loop
		result = new Covid19[resultSize];
		int idx = 0;
		prev = rows[0].positiveNumber;
		for (int i = 1; i < count; i++) {
			curr = rows[i].positiveNumber;
			diff = curr - prev;
			if (diff > 0) {
				rows[i].diff = diff;
				rows[i].rest = rows[i].positiveNumber - rows[i].recoveredNumber;
				result[idx++] = rows[i];
			} // end if
			prev = curr;
		} // end loop

		// result
		for(int i = 0; i < result.length; i++) {
			System.out.printf("%s %d %d\n", result[i].date, result[i].diff, result[i].rest);
		}
	}
}
