package thecuriouscaseofbenjaminbulbs;

import java.util.Scanner;

public class Bulbs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int bulbs=sc.nextInt();
		
		for(int i=1;i*i<bulbs;i++) {
			System.out.println(i*i);
		}
		
		sc.close();
		

	}

}
