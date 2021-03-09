package homework;

import java.util.Scanner;

public class Homework_20210309 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("과목 수를 입력 : ");
		int subjectNumber = Integer.parseInt(scan.nextLine());
		int[] subjectScores = new int[subjectNumber+1];
		int totalIndex = subjectScores.length-1;
		
		for(int i = 0; i < subjectNumber; i++) {
			System.out.print("과목 점수 입력 : ");
			
			subjectScores[i] = Integer.parseInt(scan.nextLine());
			
			subjectScores[totalIndex] += subjectScores[i];
			
			if(i== subjectNumber-1) {
				for(int j = 0; j < subjectNumber; j++) System.out.println("과목"+(j+1)+": " + subjectScores[j]);
				
				double avg = subjectScores[totalIndex] / (double) subjectNumber;
				System.out.println("총점 : " + subjectScores[totalIndex]);
				System.out.printf("평균 : %.2f", avg);
			}		
		}
	}
}
