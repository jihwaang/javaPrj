package ex6.capsule3.covid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Scanner;

public class Program {
	
	private static Scanner newScanner(String path, String encodingType) throws IOException, IOException {
		return new Scanner(new InputStreamReader(new FileInputStream(path), encodingType));
	}
	
	public static void main(String[] args) throws IOException {
		
		String path = "res/제주특별자치도_코로나현황_20201214.csv";
		String encodingType = "euc-kr";
		Scanner scanner = newScanner(path, encodingType);
		
		int count = 0;
		Covid19 covid19 = new Covid19();
		covid19.computeCovid19Size(covid19, scanner);
		
		scanner = newScanner(path, encodingType);
		covid19.createCovid19Array(covid19);
		
		int idx = -1;

		while(scanner.hasNextLine()) {
			String[] row = scanner.nextLine().split(",");
			covid19.init(covid19 , row);
			System.out.printf("%s\n", covid19.printCovid19(covid19));
			covid19.setCovid19Array(covid19 , ++idx);
			System.out.println("==>"+covid19.getCovid19Array()[idx]);
		} // end while		
		scanner.close();
		for(int i = 0; i < covid19.getCovid19Array().length; i++) {
			System.out.println("final==>"+covid19.getCovid19Array()[i]);
		}
		// 검사 진행자 수 합계 출력
		System.out.printf("%d\n", covid19.getTestsTotal(covid19));
		
		// 일별 가장 많은 검사 진행 수는?
		System.out.printf("%d", covid19.getMaxTests(covid19));
		// 확진자 수가 늘어난 일자와 수 출력
		
		
		
	} // end main
}
