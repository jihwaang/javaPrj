package homework;

import java.util.Random;

public class Homework_20210323 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto;
		// 로또를 만들고
		lotto = get(random);
		// 로또를 출력하자
		print(lotto);
		// 로또를 정렬하고
		sort(lotto);
		// 로또를 출력하자
		print(lotto);
		// 로또 중복 번호 처리
		removeDuplication(random, lotto);
		// 로또를 정렬하고
		sort(lotto);
		// 로또를 출력하자.
		print(lotto);
	}

	private static void removeDuplication(Random random, int[] lotto) {
		for(int i = 0; i < lotto.length; i++)
			for(int j = 0; j < i; j++)
				if(lotto[j] == lotto[i]) lotto[j] = random.nextInt(45)+1;
	}

	private static void sort(int[] lotto) {
		for(int i = 0; i < lotto.length; i++) {
			for(int j = 0; j < lotto.length; j++) {
				if(lotto[i]<lotto[j]) {
					int max = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = max;
				} // end if
			} // end for loop
		} // end for loop
	}

	private static void print(int[] lotto) {
		for(int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if(i < lotto.length-1)
				System.out.print(",");
			else System.out.println();
		} // end for loop
				
	}

	private static int[] get(Random random) {
		int[] lotto = new int[6];
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
		} // end for loop
		
		return lotto;
	}
}
