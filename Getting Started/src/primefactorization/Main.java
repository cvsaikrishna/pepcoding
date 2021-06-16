package primefactorization;

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  
  int n = sc.nextInt();
  for(int div=2;div*div<=n;div++){
      while(n%div==0){
          n=n/div;
          System.out.print(div+" ");
      }
  }
  if(n!=1){
      //there is only one prime factor greter than root n
      System.out.print(n);
  }
 }
}