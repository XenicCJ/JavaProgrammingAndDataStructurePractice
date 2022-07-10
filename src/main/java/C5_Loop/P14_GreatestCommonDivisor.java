package C5_Loop;

import java.util.Scanner;

/**
 * 输入两个正整数，输出最大公约数GCD
 */
public class P14_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number1,number2;

        System.out.print("Enter number1: ");
        number1=input.nextInt();
        System.out.print("Enter number2: ");
        number2=input.nextInt();

        while(number1!=number2&&number1!=0&&number2!=0){
            if(number1>number2){
                number1%=number2;
            }else {
                number2%=number1;
            }
        }

        if(number1==0||number2==0){
            System.out.println("GCD is "+(number2+number1));
        }else {
            System.out.println("GCD is "+number1);
        }


    }
}
