package gcdandlcm;

import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here 
  Scanner sc=new Scanner(System.in);
  int n1=sc.nextInt();
  int n2=sc.nextInt();
  int div=n1;
  int dvd=n2;
  
  while(dvd%div!=0){
    int r=dvd%div;
      dvd=div;
      div=r;
  }
  int gcd=div;
  int lcm=n1*n2/gcd;
  System.out.println(gcd);
  System.out.println(lcm);
 }
}
