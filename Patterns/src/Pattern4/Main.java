package Pattern4;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int stars=n;
        int spaces=0;
        
        for(int i=1;i<=n;i++){
            
            for(int k=0;k<spaces;k++){
                System.out.print("\t");
                
            }
            
            for(int j=0;j<stars;j++){
                System.out.print("*\t");
            }
            
            
            System.out.println();
            stars--;
            spaces++;
            
            
            
            
        }

    }
}
