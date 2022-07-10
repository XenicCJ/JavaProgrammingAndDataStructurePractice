package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 输入一个字符串，输出长度和第一个字符
 */
public class P20_StringProcess {
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);

        System.out.print("Input a string: ");
        str=input.next();

        System.out.println("Length of string: "+str.length());
        System.out.println("First character: "+str.charAt(0));
    }
}
