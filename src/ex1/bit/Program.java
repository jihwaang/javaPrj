package ex1.bit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws IOException {
		// 변수 선언
		FileInputStream fis = new FileInputStream("res/img.bmp");
		final int BYTE_SIZE = 8;
		int hexValue = 0x000000ff;
		int fileSize = 0;
		int shiftCount = 3;
		int dummy[] = new int[2];
		int _byte[] = new int[4];
		// 필요없는값 2bit 처리
		for (int i : dummy) {
			i = fis.read();
		}
		// 사이즈를 알기 위한 4bit 처리
		for(int i = 0; i < _byte.length; i++) {
			_byte[i] = fis.read();
		}
		// 최종 사이즈 비트연산 처리
		fileSize = (_byte[3]&hexValue) << BYTE_SIZE * shiftCount   |
				   (_byte[2]&hexValue) << BYTE_SIZE * --shiftCount |
			   	   (_byte[1]&hexValue) << BYTE_SIZE * --shiftCount |
				   (_byte[0]&hexValue);
		// 결과값 출력
		System.out.println("file size : " + fileSize);
		// 종료
		fis.close();
	}

}
