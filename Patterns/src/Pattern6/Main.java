package Pattern6;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // write ur code here
        
        int n = scn.nextInt();
        
        int stars = n/2+1;
        
        int spaces = 1;
        
        for(int i=0;i<n;i++){
            
            for(int j=0;j<stars;j++){
                System.out.print("*\t");
            }
            for(int k=0;k<spaces;k++){
                System.out.print("\t");
            }
            
            for(int l=0;l<stars;l++){
                System.out.print("*\t");
            }
            
            System.out.println();
            
            if(i<n/2){
                stars--;
                spaces=spaces+2;
            }
            else{
                stars++;
                spaces=spaces-2;
            }
            
            
            
            
            
        }
        

    }
}
