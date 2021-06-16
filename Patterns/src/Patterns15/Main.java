package Patterns15;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        int spaces = n/2;
        int stars=1;
        int count=1;
        for(int i=1;i<=n;i++){
            int temp=count;
            for(int j=0;j<spaces;j++){
                System.out.print("\t");
            }
            for(int k=0;k<stars;k++){
                System.out.print(temp+"\t");
                if(k<stars/2)
                temp++;
                else
                temp--;
            }
            System.out.println();
            if(i<=n/2){
                spaces--;
                stars=stars+2;
                count++;
            }
            else{
                spaces++;
                stars=stars-2;
                count--;
            }
            
            
            
        }

    }
}