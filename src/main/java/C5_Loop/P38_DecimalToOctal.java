package C5_Loop;

import java.util.Scanner;

/**
 * 十进制整数转八进制，使用循环解决
 */
public class P38_DecimalToOctal {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int decimalNumber;

        //get the number
        System.out.print("Enter a decimal number: ");
        decimalNumber=input.nextInt();
        int tempDecimalNumber=decimalNumber;
        boolean isPositive=(decimalNumber>=0);
        if(!isPositive)
            tempDecimalNumber=-tempDecimalNumber;

        //convert decimal string to octal string
        String octalNumberStr="";

        while(tempDecimalNumber>0){
            int curNum=tempDecimalNumber%8;
            tempDecimalNumber/=8;
            octalNumberStr=curNum+octalNumberStr;
        }

        if(octalNumberStr.length()==0){
            octalNumberStr="0";
        }

        if(!isPositive){
            octalNumberStr="-"+octalNumberStr;
        }

        System.out.println(decimalNumber+" equals "+octalNumberStr);
    }
}
