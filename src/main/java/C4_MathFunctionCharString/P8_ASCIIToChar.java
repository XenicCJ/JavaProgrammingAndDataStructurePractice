package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 用户输入ASCII码，输出对应的字符
 */
public class P8_ASCIIToChar {
    public static void main(String[] args) {
        byte ASCNumber;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter An ASCII code: ");
        ASCNumber=input.nextByte();

        char c=(char)ASCNumber;
        System.out.println("The character for ASCII code "+ASCNumber+" is "+c);
    }
}
