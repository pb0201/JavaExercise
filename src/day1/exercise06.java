package day1;

import java.util.Random;

public class exercise06 {

	public static void main(String[] args) {
		Random r = new Random();		
		int x = r.nextInt(1000);
		System.out.println(x);
		for(int y = 0; y < 1000; y++) {
			if(y == x) {
				System.out.println(y);
			}
		}
		
	}

}