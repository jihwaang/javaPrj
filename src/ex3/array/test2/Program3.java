package ex3.array.test2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("res/names.txt");
		Scanner sc = new Scanner(fis);
		StringBuffer line = new StringBuffer();

		while(sc.hasNextLine()) {
			line = line.append(sc.nextLine());			
		}
		String[] names = line.toString().split(",");
		
		for (int i = 0; i < names.length; i++) {
			names[i] = names[i].trim();
			System.out.print(names[i]);
			if(i < names.length-1) System.out.print(" ");
		}
		
		
		
		sc.close();
		fis.close();
	}
}
