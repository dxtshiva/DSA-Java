package Mathematics;

public class GCD {
    static int EuclidianOptimized(int a, int b){
        /*
        The idea here is to use reminder of the values instead of the difference to optimize the 
        solution. So instead of using a-b we can use a%b. It is here assumed that the second value
        is smaller than the first value. If in case the second value entered is greater than the first
        value, the recurssive call will result into swapping of the values;
        */

        if(b==0)
            return a;
        else
            return EuclidianOptimized(b, a%b);
    }
    static int EuclidianAlgorithm(int a, int b){
        /*
        The concept behind this algorithm is that GCD(a,b) = GCD(a-b,b) where a>b. TO prove this
        assume that g is the GCD of a and b. So now, a=gx and b=gy. Also GCD(x,y)=1 since g is the
        only greatest common factor of a and b. Now, (a-b) = g(x-y). now since GCD(x,y)=1, this 
        implies that GCD(a-b) = g.
        */
        while(a!=b){
            if(a>b)
            a = a-b;
            else
            b = b-a;
        }
        return a;
    }
    public static void main(String[] args) {
        int num1 = 84, num2 = 24;

        // Method 1: Naive solution using the iteration
        int res = Math.min(num1, num2);
        while(res>0){
            if(num1%res==0 && num2%res==0)
                break;
            res--;
        }
        System.out.println(res);

        //Method 2: Euclidian Algorithm
        System.out.println(EuclidianAlgorithm(num1, num2));

        //Method 3: using modulus operation in Euclidian Algorithm
        System.out.println(EuclidianOptimized(num1,num2));
    }
}
