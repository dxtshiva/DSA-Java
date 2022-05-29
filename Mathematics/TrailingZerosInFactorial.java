// Program to count the number of trailing zeros in the factorial of a number

package Mathematics;

public class TrailingZerosInFactorial {
    public static void main(String[] args) {
        int num = 251;

        // the idea here is to find out the number of 2 and 5 pairs because 10 leads to number of zeros
        // to do that divide the number by 5 to count how manu times 5 appeared once. But then for 25 or
        // more this would leave one 5 because 25 = 5*5. So, after 5 we divide with 25 to count the second
        // 5 but then after 125 it would the 3rd 5 because 125 = 5*5*5. So the logic is to keep checking
        // for 5^k until it is less than or equal to the number and keep adding the result.
        int res=0;
        for(int i=5;i<=num; i=i*5)
            res+= num/i;

        System.out.println(res);
    }
}
