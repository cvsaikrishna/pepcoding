package Patterns17;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        int os=n/2;
        int stars=1;
        int oos=n/2;
        
        for(int i=1;i<=n;i++){
            for(int j=0;j<os;j++){
                if(i==n/2+1){
                    System.out.print("*\t");
                }
                else
                System.out.print("\t");
            }
            for(int k=0;k<stars;k++){
                System.out.print("*\t");
            }
             for(int j=0;j<oos;j++){
                System.out.print("\t");
            }
            System.out.println();
            if(i<=n/2){
                stars++;
                oos--;
            }
            else{
                stars--;
                oos++;
            }
            
        }

    }
}