package printfirstnfibonacci;

import java.util.Scanner;

public class FibonacciTillN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.println("0");
		System.out.println("1");
		for(int i=2;i<n;i++) {
			c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
		sc.close(); 
	}

}
