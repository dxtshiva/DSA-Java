/* Program to print below pattern
    **********
    ****  ****    
    ***    ***
    **      **
    *        *
*/
package Patterns;

public class HalfButterflyInverted {
    public static void main(String[] args) {
        
        int rows = 5;

        for(int i=0;i<rows;i++){

            for(int j=rows-i-1;j>=0;j--)
                System.out.print("*");
            
            for(int j=0;j<2*i;j++)
                System.out.print(" ");
            
                for(int j=rows-i-1;j>=0;j--)
                System.out.print("*");
            
            System.out.println();
        }
    }
}
