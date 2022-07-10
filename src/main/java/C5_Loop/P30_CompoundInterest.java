package C5_Loop;

import java.util.Scanner;

/**
 * 输入金额、年利率、月数显示给定月份后账户上的钱数
 */
public class P30_CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double amount;
        double yearlyInterestRate;
        double monthlyInterestRate;
        double monthAmount;

        System.out.print("Enter amount: ");
        amount=input.nextDouble();
        System.out.print("Enter yearly interest rate: ");
        yearlyInterestRate=input.nextDouble();
        monthlyInterestRate=yearlyInterestRate/12/100;
        System.out.print("Enter month amount: ");
        monthAmount=input.nextDouble();

        for(int i=0;i<monthAmount;i++){
            amount*=(1+monthlyInterestRate);
        }

        System.out.println("The account will have "+amount+" by then.");
    }
}
