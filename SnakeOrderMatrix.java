import java.util.Scanner;

public class SnakeOrderMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements of the matrix: ");
        
        // Column-wise snake order
        for(int i=0;i<rows;i++)
        if(i%2==0)
            for(int j=0;j<cols;j++)
                matrix[i][j] = sc.nextInt();
        else
            for(int j=cols-1;j>=0;j--)
                matrix[i][j] = sc.nextInt();
        
       System.out.println("\nThe entered matrix in column-wise snake order is: ");
        
        for(int  i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }

        System.out.println("Enter the elements of the matrix: ");
        // Row-wise snake order
        for(int i=0;i<cols;i++)
            if(i%2==0)
                for(int j=0;j<rows;j++)
                    matrix[j][i] = sc.nextInt();
            else
                for(int j=rows-1;j>=0;j--)
                    matrix[j][i] = sc.nextInt();
                
        sc.close();
        
        System.out.println("\nThe entered matrix in row-wise snake order is: ");
                
        for(int  i=0;i<rows;i++){
            for(int j=0;j<cols;j++)
                System.out.print(matrix[i][j]+" ");
                System.out.println();
                }       
    }
}
