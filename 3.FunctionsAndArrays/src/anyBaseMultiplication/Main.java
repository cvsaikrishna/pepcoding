package anyBaseMultiplication;

import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();

    int d = getProduct(b, n1, n2);
    System.out.println(d);
 }

 public static int getProduct(int b, int n1, int n2){
     // write your code here
     int ans=0;
     int pow=1;
     
     while(n2>0){
         int temp=n2%10;
         int value=getSingleProduct(b,n1,temp);
         ans=getProductSum(b,ans,value*pow);
         pow=pow*10;
         n2=n2/10;
         
     }
     return ans;
     
 }
    
    public static int getSingleProduct(int b,int n1,int d){
        
        int pow=1;
        int ans=0;
        int c=0;
        while(n1>0 || c>0){
            int rem=n1%10;
            int temp=(rem*d)+c;
            ans+=(temp%b)*pow;
            c=temp/b;
            n1=n1/10;
            pow=pow*10;
        }
        return ans;
        
        
        
    }
    public static int getProductSum(int b,int n1,int n2){
        int pow=1;
        int ans=0;
        int c=0;
        while(n1>0 || n2>0 || c>0){
            int rem1=n1%10;
            int rem2=n2%10;
            int temp=rem1+rem2+c;
            ans+=(temp%b)*pow;
            c=temp/b;
            pow=pow*10;
            n1=n1/10;
            n2=n2/10;
        }
        
        return ans;
        
        
    }

}
