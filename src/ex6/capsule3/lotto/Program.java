package ex6.capsule3.lotto;

import java.util.Random;

public class Program {
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		Lotto.init(lotto);
		lotto = lotto.generate(lotto);
		print(lotto);
		lotto.sort(lotto);
		System.out.println();
		print(lotto);
	}
	
	private static void print(Lotto lotto) {
		for(int i = 0; i < lotto.getSize(lotto); i++) {
			System.out.printf("[%d] ", lotto.getNum(lotto, i));
		} // end for loop
	} // end method
}
