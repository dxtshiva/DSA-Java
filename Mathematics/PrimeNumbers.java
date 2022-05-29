package Mathematics;

public class PrimeNumbers {
    
    // Function for method 2
    static boolean checkPrime(int num){
        for(int i=2;i<Math.sqrt(num);i++)
            if(num%i==0)
                return false;
        return true;
    }

    // Function for method 3
    static boolean isPrime(int num){

        if(num==1)
            return false;

        if(num==2||num==3)
            return true;

        if(num%2==0||num%3==0)
            return false;

        for(int i=5;i<Math.sqrt(num);i+=6)
            if(num%i==0 || num%(i+2)==0)
                return false;

        return true;
    }

    public static void main(String[] args) {
        int num = 17;

        //Method 1: Using the iteration
        int flag=0;
        for(int i=2;i<num/2;i++){
            if(num%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0)
            System.out.println("Prime");
        else
            System.out.println("Not prime");

        // Method 2: Use the concept of √n. We know that any factors of numbers always comes in pairs
        // such that x*y =  num where x and y both will be factor on number. Now if x<=y ==> x*x<=num
        // or x<= √n.
        if(checkPrime(num))
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

        // Method 3: USing the concept of filtering. In this concept we know that any number
        // that is not divisible by 2 will not be divisible by any multiple of. Also we know
        // that 3 is the smallest odd prime and every 3rd number is divisible by 3. Hence we
        // cross that out as well. Now we begin our loop with 5 and check only for odd numbers
        // because every third number is multiple of 3 and all even numbers cannot be prime.
        if(isPrime(num))
            System.out.println("Prime");
        else   
            System.out.println("Not prime");
            
    }
}
