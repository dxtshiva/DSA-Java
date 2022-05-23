/*Program to print below pattern(rows can varry)
    ******
    *****
    ****
    ***
    **
    *

*/
package Patterns;

public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int rows = 7;
        for(int i=rows;i>0;i--){
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.println();
        }    
    }
}
