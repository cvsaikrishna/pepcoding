package Patterns18;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

     // write ur code here
     
     int n = scn.nextInt();
     
     int spaces=0;
     int stars=n;
     for(int i=1;i<=n;i++){
          for(int j=0;j<spaces;j++){
             System.out.print("\t");
         }
         for(int j=0;j<stars;j++){
             if(i<=n/2 && i>1){
                 if(j>0&&j<stars-1){
                     System.out.print("\t");
                 }
                 else{
                      System.out.print("*\t");
                 }
             }
             else
             System.out.print("*\t");
         }
        
         System.out.println();
         if(i<=n/2){
             spaces++;
             stars=stars-2;
         }
         else{
             spaces--;
             stars=stars+2;
         }
         
     }

 }
}
