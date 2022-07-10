package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 输入两个字符串，检查第二个字符串是否是第一个字符串的子串
 */
public class P22_IfSubstring {
    public static void main(String[] args) {
        String str1,str2;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter first string: ");
        str1=input.nextLine();
        System.out.print("Enter second string: ");
        str2=input.nextLine();

        boolean isSubstring= str1.contains(str2);

        if(isSubstring){
            System.out.println(str2+" is substring of "+str1);
        }else {
            System.out.println(str2+" is not substring of "+str1);
        }
    }
}
