import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        // Creating an object to enable user input
        Scanner sc = new Scanner(System.in);

        // Creating a 3d array 
        int arr[][][] = new int[2][2][3];

        // Taking user input in the array
        System.out.println("Enter 12 integers:");
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++)
                    arr[i][j][k] = sc.nextInt();

        // Displaying the initial contents
        System.out.println("The initial contents in the array are: ");
              for(int i=0;i<2;i++){
                for(int j=0;j<2;j++){
                    for(int k=0;k<3;k++){
                        System.out.print(arr[i][j][k]+" ");
                    }
                    System.out.println();
                }
                    System.out.println();
            }

        //Adding 97(last 2 digits of registration number to the elements)
        for(int i=0;i<2;i++)
            for(int j=0;j<2;j++)
                for(int k=0;k<3;k++)
                    arr[i][j][k] += 97;

        // Displaying the final content  
        System.out.println("The final contents in the array are: ");
        for(int i=0;i<2;i++){
            for(int j=0;j<2;j++){
                for(int k=0;k<3;k++){
                    System.out.print(arr[i][j][k]+" ");
                }
                System.out.println();
            }
                System.out.println();
        }

        sc.close();
    }
}