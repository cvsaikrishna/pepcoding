package anyBaseToAnyBase;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int sourceBase = scn.nextInt();
   int  destBase= scn.nextInt();
   int interm=n;
   int pow=0;
   int rev=0;
   int ans=0;
   int temp=1;
   while(interm!=0){
       int rem=interm%10;
       interm=interm/10;
       rev=rev+(int)Math.pow(sourceBase,pow)*rem;
       pow++;
   }
   while(rev!=0){
       int rem=rev%destBase;
       rev=rev/destBase;
       ans+=rem*temp;
       temp=temp*10;
       
   }
   System.out.println(ans);
 }   
}