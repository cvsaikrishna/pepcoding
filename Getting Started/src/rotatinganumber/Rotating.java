package rotatinganumber;

import java.util.Scanner;

public class Rotating {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String a=Integer.toString(n);
		int leng=a.length();
		int k=sc.nextInt();
		k=k%leng;
		if(k<0) {
			k=k+leng;
		}
		int div=(int)Math.pow(10, k);
		int q=n/div;
		int r=n%div;
		int mult=(int)Math.pow(10, leng-k);
		int ans=q+(mult*r);
		System.out.println(ans);
		
		sc.close();

	}

}
