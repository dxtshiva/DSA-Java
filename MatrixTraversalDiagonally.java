import java.util.Scanner;

public class MatrixTraversalDiagonally {

    private void printTopLeftToDown(int matrix[][]){
        // Variable to calculate maximum number of iterations which is equal to
        // row+cols-1 i.e. the total number of diagonals
        int max_sum = matrix.length+matrix[0].length-1;

        /* 
        If we observe the traversal, we can see that the column shifts from left to right for each 
        iteration initially and moves the rows from 0 to down until we reach the last column and then 
        the row shifts top to down from 1 keeping the column constant
        */

        // Variable to initialize the start row and column for each iteration
        int start = 0, row = 0;
        
        // Traversing the matrix for maximum number of iterations
        for(int i=0;i<max_sum;i++){

            // Checking if the column shift has reached the last column
            if(start>=matrix[0].length){
                //Changing the column shift to last column and row to one level down
                start = matrix[0].length-1;
                row++;
            }
                // variables to traverse the matrix from the current row and column shift
                int x = row, y = start;

                // traversing the matrix until row shift ends or column shift ends
                while(x<matrix.length && y>=0){

                    // Printing the element at that diagonal
                    System.out.print(matrix[x][y]+" ");

                    //Shifting the row one level down;
                    x++;

                    // Shifting the column one level left
                    y--;
                }

                // After one diagonal traversal shifting the column to one level right
                start++;

                System.out.println();
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        
        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements of the matrix: ");

        for(int  i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                matrix[i][j] = sc.nextInt();
        
        sc.close();

        System.out.println("The entered matrix is: ");
        
        for(int  i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }        
            new MatrixTraversalDiagonally().printTopLeftToDown(matrix);
    }
}
