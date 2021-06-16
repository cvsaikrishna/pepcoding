package differenceofTwoArrays;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn = new Scanner(System.in);
    int n1=scn.nextInt();
    int a[] = new int[n1];
    for(int i=0;i<n1;i++){
        a[i]=scn.nextInt();
    }
    int n2=scn.nextInt();
    int b[]=new int[n2];
    for(int i=0;i<n2;i++){
        b[i]=scn.nextInt();
    }
    int maxSize=0;
    if(n1>=n2){
        maxSize=n1;
    }
    else{
        maxSize=n2;
    }
    int ans[]= new int[maxSize];
    int c=0;
    
    for(int i=n1-1,j=n2-1,k=maxSize-1;k>=0;i--,j--,k--){
        int res=0;
        
     int temp=i>=0?a[i]:0;
     if(b[j]+c>=temp){
         res=b[j]+c-temp;
         c=0;
     }
     else{
         res=b[j]+c+10-temp;
         c=-1;
     }
     ans[k]=res;
    }
int count=0;
for(int i=0;i<maxSize;i++){
    if(ans[i]==0){
        count++;
    }
    else{
        break;
    }
}
for(int i=count;i<maxSize;i++){
    
    System.out.println(ans[i]);
}
    
    
}

}