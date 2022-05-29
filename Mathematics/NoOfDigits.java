package Mathematics;

//Program to count number of digits of a number

public class NoOfDigits {
    public static void main(String[] args) {
        
        int x = 15465;
        
        // Method 1: Use log 10 to calculate the number of digits
        System.out.println(Math.floor(Math.log10(x))+1);

        // Method 2: Using iteration
        int res=0;
        while(x>0){
            x/=10;
            res++;
        }
        System.out.println(res);
    }
}
