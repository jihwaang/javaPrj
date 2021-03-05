package ex2.control;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyProgram {

	public static void main(String[] args) throws IOException {
		// 1. res/img.bmp 파일을 읽기 위한 FileInputStream 객체 fis를 생성하고 
		// reg/img_copy.bmp 파일로 쓰기 위한 FileOutputStream 객체 fos를 생성한다.
		FileInputStream fis = new FileInputStream("res/img.bmp");
		FileOutputStream fos = new FileOutputStream("res/copy_img.bmp");
		
		// 2. fis를 통해서 1 바이트를 읽어서 int 변수 b에 담는다.
		// b의 값을 fos를 통해서 출력한다.
		// 그것을 반복한다.
		int b = 0;
		while((b = fis.read()) != -1) fos.write(b);
		
		//3. 모든 Stream 객체를 닫는다.
		fis.close();
		fos.close();
		
		System.out.println("복사완료");
	}

}
