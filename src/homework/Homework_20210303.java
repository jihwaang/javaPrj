package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Homework_20210303 {

	public static void main(String[] args) throws IOException {
		/*
		   - 'score.txt'라는 텍스트 파일을 읽어서 변수 a, b, c, d, e에 입력한다.
		   - 'socre.txt'의 내용은 다음과 같다. [37 62 98 100 50]
		   - a, b를 비트합집합으로 연산하여 변수 x에 저장한다.
		   - c, d를 비트교집합으로 연산하여 변수 y에 저장한다.
		   - 정수 x + y를 연산하여 z에 저장한다.
		   - 변수 z의 값을 'socre.txt'에 저장한다.
	  	   - 사용된 모든 입출력은 최종적으로 닫혀 있어야 한다.

		*/
		int a, b, c, d, e, x, y, z = 0;
		
		String filePath = "C:\\2021-02\\workspace\\JavaPrj\\score.txt";
		
		FileInputStream fis = new FileInputStream(filePath);
		Scanner sc = new Scanner(fis);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();
		x = a | b;
		y = c & d;
		z= x + y;
		System.out.printf("a : %d\nb : %d\nc : %d\nd : %d\nx : %d\ny : %d\nz : %d\n", a, b, c, d, x, y, z);
		sc.close();
		fis.close();

		
		FileOutputStream fos = new FileOutputStream(filePath);
		PrintStream out = new PrintStream(fos);
		out.printf("%d", z);
		out.close();
		fos.close();
		 
		
		
		
	}

}
