package day1;

import java.util.Scanner;
public class exercise08 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("input:");
		int N = input.nextInt();
		int a = 1;
		int b = 1; 
		System.out.println(a);
		System.out.println(b);
		for(int i = 3; i <= N; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.println(c);
		}
	}

}
