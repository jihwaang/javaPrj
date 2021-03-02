package homework;

import java.util.Scanner;

public class Homework_20210302 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String[] questions = {"이름 : ", "나이 : ", "지역 : ", "취미 : "};
		String name = "";
		int age = 0;
		String city = "";
		String hobby = "";
		String rstMsg = "제이름은 %s 나이는 %d 이고요 사는곳은 %s 취미는 %s 입니다.";
		
		//input area
		
		System.out.println("┌────────────────────┐");
		System.out.println("│      　나의 정보      │");
		System.out.println("└────────────────────┘");
		System.out.println("정보를 입력하세요");
		System.out.print(questions[0]);
		name = sc.nextLine();
		System.out.print(questions[1]);
		age = Integer.parseInt(sc.nextLine());
		System.out.print(questions[2]);
		city = sc.nextLine();
		System.out.print(questions[3]);
		hobby = sc.nextLine();
		
		 
		//output area
		 
		System.out.println("┌────────────────────┐");
		System.out.println("│      　정보 입력      │");
		System.out.println("└────────────────────┘");
		System.out.println(questions[0] + name);
		System.out.println(questions[1] + age);
		System.out.println(questions[2] + city);
		System.out.println(questions[3] + hobby);
		System.out.printf(rstMsg, name, age, city, hobby);
	}
}
