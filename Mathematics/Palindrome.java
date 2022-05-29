// Program to check if a given number is a palindrome number or not

package Mathematics;

public class Palindrome {
    public static void main(String[] args) {
        int num = 45654;
        int y =num, rev = 0;
        
        while(num>0){
            rev = rev*10 + num%10;
            num/=10;
        }

        if(y==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
