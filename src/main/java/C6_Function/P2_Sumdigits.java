package C6_Function;

import java.util.Scanner;

/**
 * 编写方法计算输入整数的各位之和
 */
public class P2_Sumdigits {
    public static int sumDigits(long n){
        int sum=0;
        while(n!=0){
            sum+=n%10;
            n/=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        long number;

        System.out.print("Enter a number: ");
        number=input.nextLong();

        System.out.println("Sum digits is "+sumDigits(number));
    }
}
