/* 
Program to print below pattern(rows and cols can be any value)
    *************
    *           *
    *           *
    *           *
    *************
*/
package Patterns;
public class HollowRectangle {
    public static void main(String[] args) {
        int rows = 5, cols=8;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0||i==rows-1||j==0||j==cols-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
