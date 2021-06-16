package spanOfArray;

import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner scn= new Scanner(System.in);
    int n = scn.nextInt();
    int a[] = new int[n];
    for(int i = 0; i < n; i++){
        a[i]=scn.nextInt();
    }
    int max = a[0];
    for(int i = 0; i < n; i++){
        if(a[i] > max){
            max = a[i];
        }
    }
    
    int min = a[0];
    for(int i = 0; i < n; i++){
        if(a[i] < min ){
            min = a[i];
        }
    }
    int ans = max - min;
    System.out.println(ans);
    
 }

}