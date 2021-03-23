package homework;

public class FindOneNumber {

	public static void main(String[] args) {
		int[] numbers = new int[] {1, 1, 5, 3, 3, 5, 7, 8, 8};
		int answer = findOneNumber(numbers);
		System.out.print(answer);

	}

	private static int findOneNumber(int[] numbers) {
		for(int i = 0; i < numbers.length; i++) {
			int target = numbers[i];
			int idx = 0;
			for(int j = 0; j < numbers.length; j++)
				if(target == numbers[j]) idx++;
			if(idx == 1) 
				return target;
			else
				idx = 0;
		}
		return 0;
	}

}
