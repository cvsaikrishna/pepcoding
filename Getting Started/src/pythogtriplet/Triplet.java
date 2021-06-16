package pythogtriplet;

import java.util.Scanner;

public class Triplet {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if((a*a==(b*b+c*c)) || (b*b==(a*a+c*c)) || (c*c==(b*b+a*a)))
			System.out.println("true");
		else
			System.out.println("false");
		
		sc.close();
		

	}

}
