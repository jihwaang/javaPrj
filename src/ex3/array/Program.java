package ex3.array;

import java.util.Random;

public class Program {

	public static void main(String[] args) {
		//
		Random random = new Random();
		//1. kors라는 이름의 정수 6개짜리 배열을 생성해주시오.
		int[] kors = new int[6];
		//2. kors의 3번째 방에 36을 담고 싶습니다.
		for (int i = 0; i < kors.length; i++) {
			kors[i] = random.nextInt(45)+1;
		}
		
		for(int i : kors) {
			System.out.println(i);
		}
	}

}
