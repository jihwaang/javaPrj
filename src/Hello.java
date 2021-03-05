import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

class Hello {
	public static void main(String[] args) throws IOException {
		// declare variables
		int kor, eng, math;
		int total;
		double avg;

		kor = 0;
		eng = 0;
		math = 0;
		
		// 여기에 성적을 입력하는 코드를 작성하시오.		
		
		FileInputStream fileInputStream = new FileInputStream("C:\\2021-02\\workspace\\JavaPrj\\data.txt");
		Scanner sc = new Scanner(fileInputStream);
		kor = sc.nextInt();
		eng = sc.nextInt();
		math = sc.nextInt();
		sc.close();
		fileInputStream.close();

		FileOutputStream fileOutputStream = new FileOutputStream("C:\\2021-02\\workspace\\JavaPrj\\data.txt");
		PrintStream out = new PrintStream(fileOutputStream);

		kor += 1;
		eng += 1;
		math += 1;

		out.printf("%d %d %d", kor, eng, math);
		out.close();
		fileOutputStream.close();
		
		
		
		/*
		 * System.out.println("┌────────────────────┐");
		 * System.out.println("│      　성적 입력      │");
		 * System.out.println("└────────────────────┘");
		 * 
		 * Scanner sc = new Scanner(System.in);
		 * 
		 * System.out.printf("국어1 : "); kor = Integer.parseInt(sc.nextLine());
		 * System.out.printf("영어1 : "); eng = Integer.parseInt(sc.nextLine());
		 * System.out.printf("수학1 : "); math = Integer.parseInt(sc.nextLine());
		 */
		
		total = kor + eng + math;
		avg = total / 3.0f;

		System.out.println("┌────────────────────┐");
		System.out.println("│      　성적 출력      │");
		System.out.println("└────────────────────┘");
		
		System.out.printf("국어 : %d\n", kor);
		System.out.printf("영어 : %d\n", eng);
		System.out.printf("수학 : %d\n", math);
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %-26.2f\n", avg);
		
		
		
		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.print("국어성적을 입력하세요:");
		 * 
		 * String line = scan.next(); System.out.printf("line = %s\n", line);
		 * 
		 * line = scan.next(); System.out.printf("line = %s\n", line);
		 * 
		 * kor = scan.nextInt(); System.out.printf("kor = %d\n", kor);
		 */
		
		
		
		/*
		 * System.out.print("국어성적을 입력하세요:"); int code1 = System.in.read();
		 * System.out.printf("code is %d\n", code1-48);
		 * System.out.printf("code is %c\n", code1);
		 * 
		 * int code2 = System.in.read(); System.out.printf("code is %d\n", code2-48);
		 * System.out.printf("code is %c\n", code2);
		 * 
		 * kor = (code1-48)*10+(code2-48); System.out.printf("국어성적 = %d\n", kor);
		 */
	}
}