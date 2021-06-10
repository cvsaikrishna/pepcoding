package isaNumberprime;

import java.util.Scanner;

public class Numberprime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++) {
			
			int n=sc.nextInt();
			if(isPrime(n))
				System.out.println("prime");
			else
				System.out.println("not prime");
		}
			
		sc.close();
		}
		
		public static boolean isPrime(int n) {
			for(int j=2;j*j<=n;j++) {
				if(n%j==0)
					return false;
			}
			return true;
		}
		


	}

