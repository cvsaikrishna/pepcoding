package inversenumber;

import java.util.Scanner;

public class Inverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i=1;
		int sum=0;
		while(n>0) {
			int r=n%10;
			sum=sum+(i*(int)Math.pow(10, r-1));
			n=n/10;
			i++;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
