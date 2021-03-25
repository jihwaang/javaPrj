package ex6.capsule;

import java.util.Random;

public class Lotto {
	public static void sort(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			for (int j = 0; j < i; j++) {
				if (lotto[i] < lotto[j]) {
					int max = lotto[j];
					lotto[j] = lotto[i];
					lotto[i] = max;
				} // end if
			} // end for loop
		} // end for loop
	}

	public static void print(int[] lotto) {
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i]);
			if (i < lotto.length - 1)
				System.out.print(",");
			else
				System.out.println();
		} // end for loop
	}

	public static int[] gen() {
		Random random = new Random();
		int[] lotto = new int[6];
		for(int idx = 0; idx < lotto.length; idx++) {
			int lottoNumber = random.nextInt(45) + 1;
			if (!isDuplicated(lotto, idx, lottoNumber)) {
				lotto[idx] = lottoNumber;
			}else {
				idx--;				
			}
		} // end for loop
		return lotto;
	}

	public static boolean isDuplicated(int[] lotto, int idx, int lottoNumber) {
		for (int i = 0; i < idx; i++)
			if (lotto[i] == lottoNumber)
				return true;
		return false;
	}
}
