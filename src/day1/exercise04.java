package day1;
import java.util.Scanner; 

public class exercise04 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println ("input:");
		double r = input.nextDouble();
		final double PI = 3.14159;
		
		double area = PI * r * r;
		double circumference = 2 * PI * r;
		System.out.println(area);
		System.out.println(circumference);
	}
}
