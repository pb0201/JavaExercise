package day1;
import java.util.Scanner;

public class exercise09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("input:");
		int N = input.nextInt();
		
		int index = 0;
		for(int n = 1; n <= 1000; n++) {
			int sum = 0;
			for(int m = 1; m < n; m++) {
				if(n % m == 0) {
					sum = sum + m ;
				}
			}
			if (sum == n) {
				index ++;
				if (index == N) {
					System.out.println(n);
					break;
				}
				}
			}
		}
	}



