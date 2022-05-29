// Program to check if a given number is a palindrome number or not

package Mathematics;

public class Palindrome {
    public static void main(String[] args) {
        int num = 45654;
        int temp =num, rev = 0;
        
        while(temp>0){
            rev = rev*10 + temp%10;
            temp/=10;
        }

        if(num==rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
