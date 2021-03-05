package ex2.control;

import java.util.Scanner;

public class IfProgram {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("input number is ");
		int inputNumber = scan.nextInt();
		String result = inputNumber % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result + " 값");
		System.out.println("program terminated");
	}
}
