package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 输入一个十六进制数，转变为二进制，且做输入检查
 */
public class P12_HexToDigit {
    public static void main(String[] args) {
        String str;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a hex digit: ");
        str=input.next();
        if(str.length()>1||str.length()<=0){
            System.out.println(str+" is a invalid input.");
            return;
        }
        char c=str.charAt(0);
        String bStr="";
        if(c<='9'&&c>='0'||c<='F'&&c>='A'||c<='f'&&c>='a'){
            switch (c){
                case '0':
                    bStr="0000";
                    break;
                case '1':
                    bStr="0001";
                    break;
                case '2':
                    bStr="0010";
                    break;
                case '3':
                    bStr="0011";
                    break;
                case '4':
                    bStr="0100";
                    break;
                case '5':
                    bStr="0101";
                    break;
                case '6':
                    bStr="0110";
                    break;
                case '7':
                    bStr="0111";
                    break;
                case '8':
                    bStr="1000";
                    break;
                case '9':
                    bStr="1001";
                    break;
                case 'A':
                case 'a':
                    bStr="1010";
                    break;
                case 'B':
                case 'b':
                    bStr="1011";
                    break;
                case 'C':
                case 'c':
                    bStr="1100";
                    break;
                case 'D':
                case 'd':
                    bStr="1101";
                    break;
                case 'E':
                case 'e':
                    bStr="1110";
                    break;
                case 'F':
                case 'f':
                    bStr="1111";
                    break;
            }
        }else {
            System.out.println(str+" is a invalid input.");
            return;
        }

        System.out.println("The binary value is "+bStr);
    }
}
