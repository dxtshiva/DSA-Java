package Mathematics;

public class LCM {
    static int EuclidianGCD(int a, int b){
        if(b==0)
            return a;
        return EuclidianGCD(b, a%b);
    }
    public static void main(String[] args) {
        int num1= 33391, num2 = 35317;

        //Method 1: Using the iterative approach. The idea is to start from the largest number
        // and keep searching unti a number that is divisible by both of them is found.
        int i = Math.max(num1, num2);
        while(true){
            if(i%num1==0 && i%num2==0)
                break;
            i++;
        }
        System.out.println(i);
        
        // Method 2 : Use the concept a*b = gcd(a,b)*lcm(a,b)
        System.out.println((num1*num2)/EuclidianGCD(num1, num2));
    }    
}