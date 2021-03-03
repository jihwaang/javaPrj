package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// 1. 이미지 파일을 읽기 위한 파일입력 스트림을 fis로 생성해주시오.
		
		// 선언
		String filePath = "C:\\2021-02\\workspace\\JavaPrj\\img.bmp";
		FileInputStream fis = new FileInputStream(filePath);
		Scanner scan = new Scanner(fis);
		
		//처리
		
		
		//종료
		scan.close();
		fis.close();
		
	}

}
