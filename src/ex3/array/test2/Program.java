package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws IOException {
		// 1. 문자열 10개 짜리 names 배열을 생성한다.
		String[] names = new String[10];
		// 2. 파일에서 이름들을 읽어와서 names 배열에 대입한다.
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner scan = new Scanner(fis);
		int idx = 0;
			while(scan.hasNextLine()) {
				names[idx++] = scan.nextLine();				
			}
		// 3. names 배열의 이름을 다음처럼 콘솔에 출력한다.
		// 홍길동,김길동,강호동,유재석 
		for(int i = 0; i < 9; i++) {
			if(names[i] != null) System.out.printf("%s", names[i]);
			if(names[i+1] != null) System.out.print(",");
		}
		scan.close();
		fis.close();
	}
}
