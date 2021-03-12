package ex3.array;

import java.util.Random;

public class Program2 {
	public static void main(String[] args) {
		char[] _chars = new char[10];
		char tmp;
		int cnt = _chars.length-1; 
		for (int i = 0; i < _chars.length; i++) _chars[i] = (char)('J'-i);
		for(char ch : _chars) System.out.printf("%c ", ch);
		
		System.out.println();
		
		for(int i = 0; i < _chars.length/2; i++) {
			tmp = _chars[i];
			_chars[i] = _chars[cnt];
			_chars[cnt] = tmp;
			cnt--;
		}
		for(int i = 0; i < 10; i++) {
		System.out.printf("%c ", _chars[i]);
		}
		//for(char ch : _chars) System.out.printf("%c ", ch);
		//System.out.println();
		// J부터 A까지를 채우는 코드를 작성하시오.
		//for(int i = 0; i < 10; i++) _chars[i] = (char)('J'-i);
		//for(int i = 0; i < 10; i++) System.out.printf("%c ", _chars[i]);
	}
}
