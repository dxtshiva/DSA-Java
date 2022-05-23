/*Program to print below pattern(rows can varry)
        *
       **
      ***
     ****
    *****
*/

package Patterns;

public class InvertedHalfPyramidRotated {
    public static void main(String[] args) {
        int rows=7;
        for(int i=0;i<rows;i++){

            for(int j=0;j<i;j++)
                System.out.print(" ");

            for(int j=0;j<rows-i;j++)
                System.out.print("*");
                
            System.out.println();
        }
    }
}
