package day1;
import java.util.Scanner;

public class exercise05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("input:");
		int num = input.nextInt();
		
		int temp = num;
		int multi = 1;
		while (temp > 10) {
			multi *= (temp % 10);
			temp = temp / 10;
		}
		multi = multi * temp;
		System.out.println(multi);
	}
}
