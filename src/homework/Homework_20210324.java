package homework;

import java.util.Scanner;

public class Homework_20210324 {
	/*
	 * 포만감과 레벨을 정의하고 int음식들을 만듭니다.
	 * 음식을 매개변수로 받아 포만감을 반환하는 메소드, 포만감과 레벨과 먹은 음식을 출력하는 메소드를 만듭니다.
	 * 포만감을 채울 때마다 레벨과 최대 포만감이 올라갑니다.
	 * */
	
	public static void main(String[] args) {
		NewLectStudent damhee = new NewLectStudent();
		Food food = new Food();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("1: 음식주기");
			System.out.println("2: 종료");
			System.out.println("===========");
			int input = sc.nextInt();
			if(input == 2) {
				break;
			}
			else {
				System.out.println("1. 사과 / 2.바나나 / 3. 돼지고기 / 4. 소고기 / 5. 한우 ");
				input = sc.nextInt();
				switch(input) {
				case 1:
					damhee.takeFood(food.getApple());
					break;
				case 2:
					damhee.takeFood(food.getBanana());
					break;
				case 3:
					damhee.takeFood(food.getPork());
					break;
				case 4:
					damhee.takeFood(food.getBeef());
					break;
				case 5:
					damhee.takeFood(food.getKoreaBeef());
					break;
				}
			}
		}
	}
}
