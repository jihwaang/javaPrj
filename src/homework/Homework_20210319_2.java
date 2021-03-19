package homework;

import java.util.Scanner;

public class Homework_20210319_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Numbers numbers = new Numbers();
		String[][] eachNumberSums = new String[9][];

		System.out.print("10개의 1의자리 숫자(정수)를 입력해주세요.\n>");
		String inputNumbers = sc.nextLine();

		inputNumbers = validateNumbers(inputNumbers.trim());

		getEachSum(inputNumbers, eachNumberSums, numbers);

		getTotalSum(inputNumbers, numbers);

		printResult(numbers);
	}
	
	private static String validateNumbers(String inputNumbers) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			for (int i = 0; i < inputNumbers.length(); i++) {
				if (!('0' <= inputNumbers.charAt(i) && inputNumbers.charAt(i) <= '9')) {
					inputNumbers = inputNumbers.replaceAll(String.valueOf(inputNumbers.charAt(i)), "");
					inputNumbers = inputNumbers.trim();
				} // end if
			} // end for loop

			if (inputNumbers.length() >= 10) {
				String tmp = inputNumbers;
				inputNumbers = "";
				for (int i = 0; i < 10; i++) {
					inputNumbers += tmp.charAt(i);
				} // end for loop
				System.out.println(">" + inputNumbers + "< 유효 입력값");
			} else {
				System.out.println("10개의 숫자를 입력해주세요.");
				System.out.print(">" + inputNumbers);
				String nextNumbers = sc.nextLine();
				inputNumbers += nextNumbers;
			} // end if

			if (inputNumbers.length() == 10)
				break;

		} // end while
		return inputNumbers;
	}
	
	private static void getEachSum(String inputNumbers, String[][] eachNumberSums, Numbers numbers) {
		for (int i = 1; i <= 9; i++) {
			int sum = 0;
			for (int j = 0; j < inputNumbers.length(); j++) {
				if (i == inputNumbers.charAt(j) - '0')
					sum++; // end if
			} // end for loop
			String strSum = String.valueOf(sum);
			eachNumberSums[i - 1] = new String[] { String.valueOf(i) + " : " + strSum };
			numbers.numbers[i - 1] = eachNumberSums[i - 1];
		} // end for loop

	}

	

	private static void getTotalSum(String inputNumbers, Numbers numbers) {
		int totalSum = 0;
		for (Character number : inputNumbers.toCharArray())
			totalSum += Integer.parseInt(number.toString()); // end for loop
		numbers.sum = totalSum;
	}

	private static void printResult(Numbers numbers) {
		System.out.println("배열출력");
		System.out.println("-----");
		for (String[] arr : numbers.numbers)
			for (String numberSum : arr)
				System.out.println(numberSum); // end nested for loop
		System.out.println("-----");
		System.out.println("전체 숫자의 합 : " + numbers.sum);
	}

}
