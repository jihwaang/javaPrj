package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework_20210311 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/제주특별자치도_코로나현황_20201214.csv");
		BufferedReader br = null;
		String line;
		String[] result = new String[] {"","",""};
		br = new BufferedReader(new InputStreamReader(fis, "euc-kr"));
		
		int count = 0;
		while((line = br.readLine()) != null) {
			//첫번째 줄 처리
				String[] eachLine = line.split(",");
				for (int i = 0; i < result.length; i++) {
					if(count == 1) {
						result[i] += " : ";
						eachLine[0] = eachLine[0].substring(0, 4) + "년 " + eachLine[0].substring(5, 7) + "월 " + eachLine[0].substring(8, 10) + "일";
						if(!eachLine[2].contains("명"))
							eachLine[2] += "명";
					}
					result[i] += eachLine[i];
				}
			count++;
			//첫번째 바로 다음줄에서 반복문 중단
			if(count == 2) break;
		}
		System.out.println("————————————————————————————————");
		for(String str : result) System.out.println(str);
		System.out.print("————————————————————————————————");
		br.close();
		fis.close();
		
		
	}
}
