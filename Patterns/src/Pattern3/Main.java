package Pattern3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n-1;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<spaces;j++){
                System.out.print("\t");
            }
            for(int k=0;k<stars;k++){
                System.out.print("*\t");
            }
            
           
            System.out.println();
            stars++;
            spaces--;
        }

    }
}
