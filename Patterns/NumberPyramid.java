/* Program to print pyramid
      1
     2 2
    3 3 3
   4 4 4 4
*/

package Patterns;

public class NumberPyramid {
public static void main(String[] args) {
    
    int rows = 5;
    
    for(int i=0;i<rows;i++){

        for(int j=0;j<=(rows-i-2);j++)
            System.out.print(" ");
        
        for(int j=0;j<=i;j++)
            System.out.print(i+1+" ");

        System.out.println();
    }
}    
}
