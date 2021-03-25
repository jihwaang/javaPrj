package ex6.capsule2;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
	private int[] nums;
	private int size;
	
	public static void init(Lotto lotto) {
		lotto.size = 6;
		lotto.nums = new int[lotto.size];
	}
	
	public Lotto() {}
	
	public Lotto(int[] nums) {
		this.nums = nums;
	}
	
	public Lotto generate(Lotto lotto) {
		Random random = new Random();
		
		for(int i = 0; i < 6 ; i++) {
			lotto.nums[i] = random.nextInt(45)+1;
		} // end for loop
		
		boolean isDuplicated = isDuplicated(lotto);
		
		if(isDuplicated) {
			//this = null;
			return generate(lotto);
		} // end if
		
		return this;
	} // end method

	public int[] getNums() {
		return nums;
	}
	
	public int getSize(Lotto lotto) {
		return lotto.size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getNum(Lotto lotto, int i) {
		int num = lotto.nums[i];
		return num;
	}


	public void setNums(int[] nums) {
		this.nums = nums;
	}
	
	public void sort(Lotto lotto) {
		for(int i = 0; i < lotto.getNums().length; i++) {
			for(int j = 0; j < i; j++) {
				int max = 0;
				if(lotto.getNums()[j] > lotto.getNums()[i]) {
					max = lotto.getNums()[j];
					lotto.getNums()[j] = lotto.getNums()[i];
					lotto.getNums()[i] = max;
				} // end if
			} // end for loop
		} // end for loop
	} // end method
	
	private static boolean isDuplicated(Lotto lotto) {
		for(int i = 0; i < lotto.getNums().length; i++) {
			for(int j = 0; j < i; j++) {
				if(lotto.getNums()[j] == lotto.getNums()[i])
					return true;
			} // end for loop
		} // end for loop
		return false;
	} // end method
	
	@Override
	public String toString() {
		return "Lotto [nums=" + Arrays.toString(nums) + "]";
	}
}
