/* Program to print below pattern
    *        *
    **      **
    ***    ***
    ****  ****
    **********
    **********
    ****  ****    
    ***    ***
    **      **
    *        *
*/

package Patterns;

public class Butterfly {
    public static void main(String[] args) {
        
        int rows=4;

        //Upper Half
        for(int i=0;i<rows;i++){

            for(int j=0;j<=i;j++)
                System.out.print("*");
            
            for(int j=0;j<(rows-i-1)*2;j++)
                System.out.print(" ");
            
            for(int j=0;j<=i;j++)
                System.out.print("*");
            
            System.out.println();
        }

        // Lower half
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
