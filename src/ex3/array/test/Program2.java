package ex3.array.test;

import java.util.Arrays;
import java.util.Random;

public class Program2 {
	public static void main(String[] args) {
		Random random = new Random();
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		int repeatCount = 100;
		
		for (int i = 0; i < repeatCount; i++) {
			int idx1 = random.nextInt(nums.length);
			int idx2 = random.nextInt(nums.length);
			
			int tmp = nums[idx1];
			nums[idx1] = nums[idx2];
			nums[idx2] = tmp;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);
			if(i < nums.length-1) System.out.print(",");
		}
		
		// 정렬(버블정렬/선택정렬/퀵정렬...)
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < i; j++) {
				int max;
				if (nums[j] > nums[i]) {
					max = nums[j];
					nums[j] = nums[i];
					nums[i] = max;
				}
			}
		}
		
		System.out.println();
		for(int i = 0; i < 10; i++) {
			System.out.printf("%d", nums[i]);
			if(i < nums.length-1) System.out.print(",");
		}
	}
}
