package ex3.array.test2;

import java.util.Arrays;
import java.util.Random;

public class Program2 {
	public static void main(String[] args) {
		String[] names = new String[] {"강호동","유재석","하하","김지호","김태희","박민정","김현준"};
		
		Random random = new Random();
		
		for(int i = 0; i < 100; i++) {
			int idx1 = random.nextInt(7);
			int idx2 = random.nextInt(7);
			
			String temp;
			temp = names[idx1];
			names[idx1] = names[idx2];
			names[idx2] = temp;
		}
		
		for(int i = 0; i< 7; i++) {
			System.out.printf("\"%s\"", names[i]);
			if(i<7-1)
				System.out.print(",");
		}
		
		System.out.println();
		// 정렬
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < i; j++) {
				if(names[j].compareTo(names[i]) > 0) {
					String temp = names[j];
					names[j] = names[i];
					names[i] = temp;
				}
			}
		}
		for(int i = 0; i< 7; i++) {
			System.out.printf("\"%s\"", names[i]);
			if(i<7-1)
				System.out.print(",");
		}
	}
}
