package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入一个三位数字，判断是否为回文数字
 */
public class P12_IsPalindrome {
    public static void main(String[] args) {
        int number;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");

        number=input.nextInt();

        if((number%10)==(number/100)){
            System.out.println(number+" is a palindrome.");
        }else{
            System.out.println(number+" is not a palindrome.");
        }
    }
}
