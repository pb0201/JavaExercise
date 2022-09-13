package day1;
import java.util.Scanner;

public class exercise07 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter weight:");
		double w = input.nextDouble();
		
		if (w > 0 && w <= 3) {
			System.out.println("costs = 1.5");
		}
		else if (w <= 5) 
			System.out.println("costs = 2.5");
		else if (w <= 10) 
			System.out.println("costs = 4.2");
		else if (w < 0 || w >10)
			System.out.println("please enter weight betwen 3 ~ 10");
	}

}
