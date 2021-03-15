package homework;

import java.util.Scanner;

public class Homework_20210315 {
	public static void main(String[] args) {
		// 변수 선언부
		Scanner sc = new Scanner(System.in);;
		int[][] array;
		int firstIndexValue;
		int secondIndexValue;
		int firstIndexToInsert;
		int secondIndexToInsert;
		// 배열 생성부
		{
			 System.out.print("1~9 사이의 두 개의 정수 입력(입력형식 정수,정수) : ");
			 String[] input = sc.nextLine().split(",");
			 firstIndexValue = Integer.parseInt(input[0]);
			 secondIndexValue = Integer.parseInt(input[1]);
			 array = new int[firstIndexValue][secondIndexValue];
		}
		// 배열 값 입력부
		{
			firstIndexToInsert = firstIndexValue-1;
			secondIndexToInsert = secondIndexValue-1;
			int result = firstIndexValue * secondIndexValue;
			array[firstIndexToInsert][secondIndexToInsert] = result;
		}
		// 배열 값 출력부
		{
			for(int i = 0; i < firstIndexValue; i++)
				for(int j = 0; j < secondIndexValue; j++)
					if(i==firstIndexToInsert && j==secondIndexToInsert)
						System.out.printf("%d!\n",array[i][j]);
		}
	}
}
