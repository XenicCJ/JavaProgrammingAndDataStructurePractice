package C3_Choose;

import java.util.Scanner;

/**
 * 判断输入的整数是否可以被5和6，5或6，5异或6整除
 */
public class P26_IfDivisibleBy5AndOr6 {
    public static void main(String[] args) {
        int number;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number: ");
        number=input.nextInt();

        System.out.println("Is "+number+" divisible by 5 and 6? "+(number%5==0&&number%6==0));
        System.out.println("Is "+number+" divisible by 5 or 6? "+(number%5==0||number%6==0));
        System.out.println("Is "+number+" divisible by 5 and 6, but not both? "+(number%5==0^number%6==0));
    }
}
