package decimalToAnyBase;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
 }

 public static int getValueInBase(int n, int b){
     // write code here
     int temp=1;
     int rv=0;
     while(n!=0){
         int rem=n%b;
         n=n/b;
         
         rv=rv+(rem*temp);
         
         temp=temp*10;
         
         
     }
     return rv;
 }
}
