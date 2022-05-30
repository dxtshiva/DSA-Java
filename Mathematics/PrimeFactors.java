package Mathematics;

public class PrimeFactors {
    static boolean isPrime(int num){
        if(num<=1)
            return false;
        if(num==2||num==3)
            return true;
        if(num%2==0||num%3==0)
            return false;
        
            for(int i=5;i<=Math.sqrt(num);i+=6)
                if(num%i==0||num%(i+2)==0)
                    return false;
            return true;
    }

    // Function for method 2
    static void getFactors(int num){
        if(num<=1)
            return;
        for(int i=2;i<=Math.sqrt(num);i++){
            while(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
        }
        if(num>1)
            System.out.println(num);
    }

    // Function for method 3
    static void primeFactors(int num){
        if(num<=1)
            return;
        while(num%2==0){
            System.out.print(2+" ");
            num/=2;
        }
        while(num%3==0){
            System.out.print(3+" ");
            num/=3;
        }
        for(int i=5;i<=Math.sqrt(num);i+=6){
            while(num%i==0){
                System.out.print(i+" ");
                num/=i;
            }
            while(num%(i+2)==0){
                System.out.print((i+2)+" ");
                num/=(i+2);
            }
        }
        if(num>3)
            System.out.println(num);
    }
    public static void main(String[] args) {
        int num =450;
        
        //Method 1: Using iteration
        for(int i=2;i<num;i++){
            if(isPrime(i)){
                int x =i;
                while(num%x==0){
                    System.out.print(i+" ");
                    x*=i;
                }
            }
        }
        System.out.println();

        // Method 2: Optimised iteration solution. Use the concept of √n. We know that any factors of 
        // numbers always comes in pairs such that x*y =  num where x and y both will be factor on 
        // number. Now if x<=y ==> x*x<=num or x<= √n.
        getFactors(num);
        System.out.println();
        // Method 3: USing the concept of filtering. In this concept we know that any number
        // that is not divisible by 2 will not be divisible by any multiple of 2. Also we know
        // that 3 is the smallest odd prime and every 3rd number is divisible by 3. Hence we
        // cross that out as well. Now we begin our loop with 5 and check only for odd numbers
        // because every third number is multiple of 3 and all even numbers cannot be prime.
        primeFactors(num);
    }
}
