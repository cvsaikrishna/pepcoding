package anyBaseSubtraction;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getDifference(b, n1, n2);
    System.out.println(d);
 }

 public static int getDifference(int b, int n1, int n2){
     // write your code here
     int c=0;
     int pow=1;
     int ans=0;
     while(n1>0 || n2>0 || c!=0){
         
         int rem1=n1%10;
         int rem2=n2%10;
         rem2=rem2+c;
         if(rem2>=rem1){
             c=0;
             ans+=(rem2-rem1)*pow;
         }
         else{
             c=-1;
             ans+=(rem2+b-rem1)*pow;
         }
         n1=n1/10;
         n2=n2/10;
         pow=pow*10;
         
         
         
     }
     return ans;
 }

}
