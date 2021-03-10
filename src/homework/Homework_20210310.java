package homework;

public class Homework_20210310 {
	public static void main(String[] args) {
		for(int i = 2; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
			System.out.printf("============%d단=============\n", i);
		}
	}
}
