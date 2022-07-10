package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 输入余额和年利率百分比，打印下个月利息
 */
public class P20_CalculateInterest {
    public static void main(String[] args) {
        double balance,interestRate;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter balance and interest rate (e.g., 3 for 3%): ");
        balance=input.nextDouble();
        interestRate=input.nextDouble();

        double interest=balance*interestRate/1200;
        System.out.println("The interest is: "+interest);
    }
}
