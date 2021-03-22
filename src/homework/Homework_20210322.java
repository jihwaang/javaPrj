package homework;

public class Homework_20210322 {

	public static void main(String[] args) {
		String[][] array = make2dStringArray(2,4);
		printArray(array);
	}

	private static void printArray(String[][] array) {
		for(String[] arr : array)
			for(String idx : arr)
				System.out.println(idx);
		
	}

	private static String[][] make2dStringArray(int a, int b) {
		String[][] array = new String[a][b];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				StringBuffer insertValue = new StringBuffer("[][]");
				char x = (char) ((i+1)+'0');
				char y = (char) ((j+1)+'0');
				insertValue.insert(1, x);
				insertValue.insert(4, y);
				array[i][j] = insertValue.toString();
			}
		}
		return array;
	}

}
