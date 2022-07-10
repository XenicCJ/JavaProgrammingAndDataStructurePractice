package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 输入以美分为单位的货币量，输出最合适的货币分配策略，货币有1元、25分、10分、5分、1分的
 */
public class P22_CurrencyUnit {
    public static void main(String[] args) {
        int amount;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a amount in int, for example 1156: ");
        amount=input.nextInt();
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
