package ex3.array.test;

public class Program {
	public static void main(String[] args) {
		int[] nums = new int[10];
		int evenNumber = 2;
		int number3 = 3;
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = (i+1) * evenNumber;
//		}
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = i % number3 + 1;
		}
		
		
		for(int i = 0; i < nums.length; i++) {
			System.out.printf("%d", nums[i]);
			if(i < nums.length-1) System.out.print(",");
		}
	}
}
