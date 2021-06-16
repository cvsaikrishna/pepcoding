package subsetsOfArray;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int a[] =  new int[n];
    for(int i = 0; i < n; i++){
        a[i]=scn.nextInt();
    }
    
    int count = (int) Math.pow(2,n);
    
    for(int i=0;i<count;i++){
        
        int bin=decimaltoBinary(i);
        
        int div=(int)Math.pow(10,n-1);
        int ele=0;
        while(div>0){
            int q=bin/div;
            if(q==0)
                System.out.print("-\t");
            else
                System.out.print(a[ele]+"\t");
            bin=bin%div;
            div=div/10;
            ele++;
        }
        
        System.out.println();
        
    }
    
 }
 
 public static int decimaltoBinary(int n){
     int ans=0;
     int pow=1;
     while(n!=0){
         int r=n%2;
         n=n/2;
         ans+=r*pow;
         pow=pow*10;
         
     }
     return ans;
 }

}
