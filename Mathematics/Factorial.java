// Program to find factorial of a number 

package Mathematics;

public class Factorial {

    // Function to recursively calculate the factorial of a given number
    static int factorial(int n){
        if(n<0)
            return -1;
        else if( n==0 || n==1)
            return 1;
        
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int num = 8;
    
    // Method 1: Using iteration
    int res = 1;
    for(int i=2;i<=num;i++)
        res*=i;

    System.out.println(res);

    //Method 2: USing recursion
    System.out.println(factorial(num));

    }
 
}
