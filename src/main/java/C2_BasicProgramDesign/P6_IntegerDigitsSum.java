package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 求读取的一个1000以内的正整数的各位之和
 */
public class P6_IntegerDigitsSum {
    public static void main(String[] args) {
        int number,sum;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number between 0 and 1000: ");
        number=input.nextInt();

        sum=number/100+number%100/10+number%10;
        System.out.println("The sum of the digits is: "+sum);
    }
}
