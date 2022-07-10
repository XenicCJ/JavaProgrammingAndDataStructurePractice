package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 重写程序清单2-10，解决类型转换造成的精度损失问题
 */
public class P26_CurrencyUnit {
    public static void main(String[] args) {
        String amountStr;
        int amount;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a amount, for example 11.56: ");
        amountStr=input.next();

        amount=Integer.parseInt(amountStr.substring(0,amountStr.indexOf('.')))*100+Integer.parseInt(amountStr.substring(amountStr.indexOf('.')+1));

        int remainingAmount=amount;

        int numberOfDollars=remainingAmount/100;
        remainingAmount%=100;

        int numberOfQuaters=remainingAmount/25;
        remainingAmount%=25;

        int numberOfDimes=remainingAmount/10;
        remainingAmount%=10;

        int numberOfNickels=remainingAmount/5;
        remainingAmount%=5;

        int numberOfPennies=remainingAmount/1;
        remainingAmount%=1;

        System.out.println("Your amount "+amount+" consists of:\n"+
                "\t"+numberOfDollars+" dollars\n"+
                "\t"+numberOfQuaters+" quaters\n"+
                "\t"+numberOfDimes+" dimes\n"+
                "\t"+numberOfNickels+" nickels\n"+
                "\t"+numberOfPennies+" pennies\n");
    }
}
