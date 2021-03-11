package homework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;
import java.util.Scanner;

public class Homework_20210311 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv");
		InputStreamReader isr = new InputStreamReader(fis, "euc-kr");
		Scanner sc = new Scanner(isr);
		String firstLine = sc.nextLine();
		String[] firstLineResult = firstLine.split(",");
		String eachLine;
		String[] datas = null;
		while(sc.hasNextLine()) {
			eachLine = sc.nextLine();
			datas = eachLine.split(",");
			datas[0] = datas[0].substring(0,4)+"년 "
			          +datas[0].substring(5,7)+"월 "
			          +datas[0].substring(8,10)+"일"; 
			break;
		}
		if(datas !=null) 
			for(int i = 0; i < 3; i++)
				System.out.println(firstLineResult[i] + " : " + datas[i]);
		sc.close();
		fis.close();
		
		
	}
}
