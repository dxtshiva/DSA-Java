/*Program to print below pattern(rows can varry)
        *
       **
      ***
     ****
    *****
*/
package Patterns;

public class HalfPyramidRotated {
    public static void main(String[] args) {
        int rows=7;
        for(int i=0;i<rows;i++){

            // Method 1 for spaces
            for(int j=0;j<rows-i-1;j++)
                System.out.print(" ");
            
            // Method 2 for spaces
            // for(int j=rows-1;j>i;j--)
            //     System.out.print(" ");

            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
