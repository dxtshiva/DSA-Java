package Matrix;
import java.util.Scanner;

public class MatrixTraversalDiagonally {

    private void printTopLeftToDown(int matrix[][]){

        //Getting number of rows and cols in the matrix
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        // Variable to calculate maximum number of iterations which is equal to
        // row+cols-1 i.e. the total number of diagonals
        int max_sum = rowNum+colNum-1;

        /* 
        If we observe the traversal, we can see that the column shifts from left to right for each 
        iteration initially and moves the rows from 0 to down until we reach the last column and then 
        the row shifts top to down from row number 1 keeping the column constant
        */

        // Variable to initialize the start row and column for each iteration
        int startCol = 0, startRow = 0;
        
        // Traversing the matrix until maximum number of iterations
        for(int i=0;i<max_sum;i++){

            // Checking if the column shift has reached the last column
            if(startCol>=colNum){
                //Changing the column shift to last column and row to one level down
                startCol = colNum-1;
                startRow++;
            }
                // variables to traverse the matrix from the current row and column shift
                int x = startRow, y = startCol;

                // traversing the matrix until row shift ends or column shift ends
                while(x<rowNum && y>=0){

                    // Printing the element at that diagonal
                    System.out.print(matrix[x][y]+" ");

                    //Shifting the row one level down;
                    x++;

                    // Shifting the column one level left
                    y--;
                }

                // After one diagonal traversal shifting the column to one level right
                startCol++;

                System.out.println();
        }
    }

    private void printTopRightToDown(int matrix[][]){
        
        //Getting number of rows and columns in the matrix
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        // Variable to calculate maximum number of iterations which is equal to
        // row+cols-1 i.e. the total number of diagonals
        int max_sum = rowNum+colNum-1;

        /*
        If we observe the traversal we can see that the column shifts from right to left for each
        iteration and moves the rows from 0 to down until we reach the column 0, and then the column
        shift from top to sown from row number 1 keeping column constant
        */

        // Variable to determine the start row and column for each iteration
        int startRow =0; int startCol = colNum-1;

        // Traversing the matrix until maximum number of iterations
        for(int i=0;i<max_sum;i++){
            // Checking if the value of column shift has reached first column
            if(startCol<0){
                // Keeping the column constant while shifting the row one level down
                startCol=0;
                startRow++;
            }

            // Variable to traverse the matrix from current row and column shift
            int x = startRow, y = startCol;

            // traversing the matrix until row shift ends or column shift ends
            while(x<rowNum && y<colNum){

                // Printing the element at that diagonal
                System.out.print(matrix[x][y]+" ");

                //Shifting the row one level down;
                x++;

                // Shifting the column one level left
                y++;
            }

            // After one diagonal traversal shifting the column to one level right
            startCol--;

            System.out.println();
        }
    }

    private void printButtomLeftUp(int matrix[][]){
        
        //Getting number of rows and columns in the matrix
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        // Variable to calculate maximum number of iterations which is equal to
        // row+cols-1 i.e. the total number of diagonals
        int max_sum = rowNum+colNum-1;

        /*
        If we observe the traversal we can see that the row shifts from buttom to top for each
        iteration and moves the column from 0 to down until we reach the row 0, and then the column
        shift from left to right from row number 0 keeping row constant
        */

        // Variable to determine the start row and column for each iteration
        int startRow =rowNum-1; int startCol = 0;

        // Traversing the matrix until maximum number of iterations
        for(int i=0;i<max_sum;i++){
            // Checking if the value of row shift has reached first row
            if(startRow<0){
                // Keeping the row constant while shifting the column one level right
                startCol++;
                startRow=0;
            }

            // Variable to traverse the matrix from current row and column shift
            int x = startRow, y = startCol;

            // traversing the matrix until row shift ends or column shift ends
            while(x<rowNum && y<colNum){

                // Printing the element at that diagonal
                System.out.print(matrix[x][y]+" ");

                //Shifting the row one level down;
                x++;

                // Shifting the column one level right
                y++;
            }

            // After one diagonal traversal shifting the row to one level up
            startRow--;

            System.out.println();
        }
    }

    private void printButtomRightUp(int matrix[][]){
        
        //Getting number of rows and columns in the matrix
        int rowNum = matrix.length;
        int colNum = matrix[0].length;

        // Variable to calculate maximum number of iterations which is equal to
        // row+cols-1 i.e. the total number of diagonals
        int max_sum = rowNum+colNum-1;

        /*
        If we observe the traversal we can see that the row shifts from buttom to top for each
        iteration and moves the column from right to left until we reach the row 0, and then the column
        shift from right to left from row number 0 keeping row constant
        */

        // Variable to determine the start row and column for each iteration
        int startRow =rowNum-1; int startCol = colNum-1;

        // Traversing the matrix until maximum number of iterations
        for(int i=0;i<max_sum;i++){
            // Checking if the value of row shift has reached first row
            if(startRow<0){
                // Keeping the row constant while shifting the column one level left
                startCol--;
                startRow=0;
            }

            // Variable to traverse the matrix from current row and column shift
            int x = startRow, y = startCol;

            // traversing the matrix until row shift ends or column shift ends
            while(x<rowNum && y>=0){

                // Printing the element at that diagonal
                System.out.print(matrix[x][y]+" ");

                //Shifting the row one level down;
                x++;

                // Shifting the column one level left
                y--;
            }

            // After one diagonal traversal shifting the row to one level up
            startRow--;

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

        System.out.println("\nThe entered matrix is: ");
        
        for(int  i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }        
            System.out.println("\nTop left to buttom traversal of matrix is: ");
            new MatrixTraversalDiagonally().printTopLeftToDown(matrix);

            System.out.println("\nTop right to buttom traversal of matrix is: ");
            new MatrixTraversalDiagonally().printTopRightToDown(matrix);

            System.out.println("\nButtom left to top traversal of matrix is: ");
            new MatrixTraversalDiagonally().printButtomLeftUp(matrix);

            System.out.println("\nButtom right to top traversal of matrix is: ");
            new MatrixTraversalDiagonally().printButtomRightUp(matrix);
    }
}
