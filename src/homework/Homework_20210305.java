package homework;

import java.util.Scanner;

public class Homework_20210305 {
	public static void main(String[] args) {
//		Mission
//		-초기 정수값을 입력하고 해당 정수에 대한 소인수 공부 코드를 작성한다
//		-새 입력값이 소인수가 맞으면 “x는 x의 소인수가 맞다”고 출력하고 중복된 값을 입력하면 “중복됐다”고 출력하고 소인수가 더 남았으면 “더 입력해 달라”고 출력한다
//		-입력값이 소인수가 아니라면 “아니라”고 출력하고 “다시 입력해 달라”고 출력한다
//		-소인수를 다 입력했으면 격려의 말을 출력한다
//		-while문과 if문을 이용한다
		
		Scanner scan = new Scanner(System.in);
		System.out.print("초기 정수값 입력 : ");
		int x = scan.nextInt();
		boolean isFinished = false;
		boolean isPrimeNumber = checkPrimeNumber(x);
		
		while(true) {
			if(isPrimeNumber) {
				System.out.println("다시 작성해주세요.");
				System.out.print("초기 정수값 입력 : ");
				x = scan.nextInt();
				isPrimeNumber = checkPrimeNumber(x);
			}else {
				break;
			}
		}
		
		while(!isFinished && 1 < x) {
			System.out.print("인수값 입력 : ");
			int y = scan.nextInt();
			if(x % y == 0) {
				System.out.println("y는 x의 소인수가 맞다");
				System.out.print("소인수를 다 입력하셨습니까?(true/false)");
				isFinished = scan.nextBoolean();
			}else {
				System.out.println("소인수가 아니다");
				System.out.println("다시 입력해달라");
			}
			if(isFinished) System.out.println("수고하셨습니다.");
		}
	}

	private static boolean checkPrimeNumber(int x) {
		if(x < 2) {
			return false;
		}else if(x == 2){
			return true;
		}else {
			int i = 2;
			while(i < x) {
				if(x % i == 0) return false;
				i++;
			}
			return true;
		}
	}
}
