package displayingdigits;

import java.util.Scanner;

public class DisplayDigits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String a=Integer.toString(n);
		int leng = a.length();
		int div=(int)Math.pow(10, leng-1);
		while(div>0) {
			
			int q=n/div;
			System.out.println(q);
			n = n % div;
			div=div/10;
		}
		sc.close();
	}

}
