
/* Program to print the below pattern(row and columns can be of any given size):
        *************
        *************
        *************
        *************
        *************
*/
package Patterns;
public class SolidRectangle {
    public static void main(String[] args) {
        int rows = 5, cols = 8;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}
