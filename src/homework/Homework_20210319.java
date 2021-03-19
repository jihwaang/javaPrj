package homework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Homework_20210319 {
	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException {
		// Scanner
		Scanner sc = new Scanner(
				new InputStreamReader(new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv"), "euc-kr"));
		// Title
		String[] title = sc.nextLine().split(",");
		// Size of Covid19 array
		int count = 0;
		// Data list
		Covid19[] list;
		// Load the file
		while (sc.hasNext()) {
			sc.nextLine();
			count++;
		}
		sc.close();
		// Another Scanner for inserting into the list
		sc = new Scanner(new InputStreamReader(new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv"), "euc-kr"));
		// Except the title line
		sc.nextLine();
		// Construct
		list = new Covid19[count];
		// Insert Process
		for (int i = 0; i < count; i++) {
			Covid19 covid = new Covid19();
			String line = sc.nextLine(); // -> 2020-10-01,59,0,28,0,0,58,8,230,2020-12-14
			String[] tokens = line.split(","); 

			covid.date = tokens[0];
			covid.cases = Integer.parseInt(tokens[1]);
			covid.deaths = Integer.parseInt(tokens[2]);
			covid.tests = Integer.parseInt(tokens[3]);
			covid.selfIsolation = Integer.parseInt(tokens[4]);
			covid.release = Integer.parseInt(tokens[5]);
			covid.recover = Integer.parseInt(tokens[6]);
			covid.selfQuarantineDomestic = Integer.parseInt(tokens[7]);
			covid.selfQuarantineImported = Integer.parseInt(tokens[8]);
			covid.pubDate = tokens[9];

			list[i] = covid;
		}

		sc.close();
		// Print
		for (int i = 0; i < count; i++) {
			Covid19 covid = list[i];
			int idx = -1;
			for(String str : title) {
				if
					(++idx == 0) System.out.print(" " + str + "    ");
				else
					System.out.print(str + "    ");
			}
			System.out.println();
			System.out.print(covid.date + "\t");
			System.out.print(covid.cases + "\t");
			System.out.print(covid.deaths + "\t\t ");
			System.out.print(covid.tests + "\t\t");
			System.out.print(covid.selfIsolation + "\t      ");
			System.out.print(covid.release + "\t\t");
			System.out.print(covid.recover + "\t\t");
			System.out.print(covid.selfQuarantineDomestic + "\t\t");
			System.out.print(covid.selfQuarantineImported + "\t\t  ");
			System.out.print(covid.pubDate + "\n");
		}

	}
}
