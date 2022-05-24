/* Program to print the below pattern
            *
           ***
          *****
         *******
         *******
          *****
           ***
            * 

*/

package Patterns;

public class PalindromePattern {
    public static void main(String[] args) {
        int rows =4;

        // Upper Half
        for(int i=1;i<=rows;i++){

            for(int j=1;j<=rows-i;j++)
                System.out.print(" ");

            for(int j=0;j<(2*i)-1;j++)
                System.out.print("*");

            System.out.println();
        }

        //Lower half
        for(int i=1;i<=rows;i++){

            for(int j=1;j<i;j++)
                System.out.print(" ");
                
            for(int j=1;j<=2*(rows-i)+1;j++)
                System.out.print("*");

            System.out.println();
        }
    }
}
