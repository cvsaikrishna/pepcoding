package Pattern5;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int stars = 1;
        int spaces = n/2;
        
        for(int i = 0;i<n;i++){
            
            for(int j=0;j<spaces;j++){
                System.out.print("\t");
            }
            for(int k=0;k<stars;k++){
                System.out.print("*\t");
            }
            
            System.out.println();
            
            if(i<n/2){
                spaces--;
                stars=stars+2;
            }
            else{
                spaces++;
                stars=stars-2;
            }
            
            
            
            
            
            
        }

    }
}