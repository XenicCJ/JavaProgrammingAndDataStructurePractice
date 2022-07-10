package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入前9位ISBN码，程序补全并输出10位ISBN码
 */
public class P9_ISBN10Test {
    public static void main(String[] args) {
        long isbn9;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first 9 digits of ISBN-10 code: ");
        isbn9=input.nextLong();

        int d9=(int)(isbn9%10);
        int d8=(int) (isbn9/10%10);
        int d7=(int) (isbn9/100%10);
        int d6=(int) (isbn9/1000%10);
        int d5=(int) (isbn9/10000%10);
        int d4=(int) (isbn9/100000%10);
        int d3=(int) (isbn9/1000000%10);
        int d2=(int) (isbn9/10000000%10);
        int d1=(int) (isbn9/100000000%10);

        int d10Int=(d1+2*d2+3*d3+4*d4+5*d5+6*d6+7*d7+8*d8+9*d9)%11;
        char d10Char;
        if(d10Int<10){
            d10Char=(char) ('0'+d10Int);
        }else {
            d10Char='X';
        }
        System.out.println("The ISBN-10 code is: "+d1+d2+d3+d4+d5+d6+d7+d8+d9+d10Char);
    }
}
