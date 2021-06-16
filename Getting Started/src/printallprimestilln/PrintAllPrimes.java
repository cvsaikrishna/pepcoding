package printallprimestilln;

import java.util.Scanner;

public class PrintAllPrimes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int low=sc.nextInt();
		int high=sc.nextInt();
		for(int i=low;i<=high;i++) {
			
			if(isPrime(i))
				System.out.println(i);
			
			
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
