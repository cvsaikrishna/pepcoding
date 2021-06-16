package Patterns16;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
     int n =  scn.nextInt();
     int spaces=2*n-3;
     int stars=1;
     for(int i=1;i<=n;i++){
         for(int j=1;j<=stars;j++){
             System.out.print(j+"\t");
         }
          for(int j=1;j<=spaces;j++){
             System.out.print("\t");
         }
         if(i==n){
             stars--;
         }
          for(int j=stars;j>=1;j--){
             System.out.print(j+"\t");
         }
         System.out.println();
             stars++;
             spaces=spaces-2;
         
     }
     

 }
}
