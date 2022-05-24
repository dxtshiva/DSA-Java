/* Program to print the below pattern
            1
           212
          32123
         4321234        

*/

package Patterns;

public class PalindromicPattern {
    public static void main(String[] args) {
        
        int rows =5;
        // With spaces between numbers
        for(int i=1;i<=rows;i++){
            
            for(int j=2*(rows-i);j>0;j--)
                System.out.print(" ");
            for(int j = i;j>0;j-- )
                System.out.print(j+" ");

            for(int j=2;j<=i;j++)
                System.out.print(j+" ");
            
            System.out.println();
        }

        // Without spaces between numbers
        for(int i=1;i<=rows;i++){
            
            for(int j=(rows-i);j>0;j--)
                System.out.print(" ");
            for(int j = i;j>0;j-- )
                System.out.print(j);

            for(int j=2;j<=i;j++)
                System.out.print(j);
            
            System.out.println();
        }
    }
}
