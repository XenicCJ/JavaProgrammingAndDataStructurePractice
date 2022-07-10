package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 输入ABCDF之一。显示43210之一，对其他输入提示非法等级
 */
public class P14_AlphabetToNumber {
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a letter grade: ");
        str=input.next();
        str.trim();

        if(str.length()!=1){
            System.out.println(str+" is a invalid grade.");
        }else{

            switch (str.charAt(0)){
                case 'A':
                    System.out.print("The numeric value for grade "+str.charAt(0)+" is 4");
                    break;
                case 'B':
                    System.out.print("The numeric value for grade "+str.charAt(0)+" is 3");
                    break;
                case 'C':
                    System.out.print("The numeric value for grade "+str.charAt(0)+" is 2");
                    break;
                case 'D':
                    System.out.print("The numeric value for grade "+str.charAt(0)+" is 1");
                    break;
                case 'F':
                    System.out.print("The numeric value for grade "+str.charAt(0)+" is 0");
                    break;
                default:
                    System.out.println(str.charAt(0)+" is a invalid grade.");
                    break;
            }
        }
    }
}
