package C5_Loop;

import java.util.Scanner;

/**
 * 列出分期贷款还款表的程序，输入贷款额、年数、年利率，输出月支付额、总支付额、还款表
 */
public class P22_InstallmentLoan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double loanAmount=0;
        int numberOfYears=0;
        int numberOfMonths=0;
        double annualInterestRate=0;
        double monthlyInterestRate=0;
        double totalPayment=0;
        double monthlyPayment=0;

        System.out.print("Loan Amount: ");
        loanAmount=input.nextDouble();
        System.out.print("Number Of Years: ");
        numberOfYears=input.nextInt();
        numberOfMonths=numberOfYears*12;
        System.out.print("Annual Interest Rate: ");
        annualInterestRate=input.nextDouble();
        monthlyInterestRate=annualInterestRate/100/12;

        monthlyPayment=(loanAmount*monthlyInterestRate*Math.pow((1+monthlyInterestRate),numberOfMonths))/(Math.pow((1+monthlyInterestRate),numberOfMonths)-1);
        totalPayment=monthlyPayment*numberOfMonths;
        System.out.println("Monthly Payment: "+String.format("%.2f", monthlyPayment));
        System.out.println("Total Payment: "+String.format("%.2f", totalPayment));

        double balance=loanAmount;
        double monthlyInterest;
        double principle;
        System.out.println("Payment#\tInterest\tPrinciple\tBalance");
        for(int i=0;i<numberOfMonths;i++){
            monthlyInterest=balance*monthlyInterestRate;
            principle=monthlyPayment-monthlyInterest;
            balance-=principle;
            System.out.println(i+"\t\t"+String.format("%.2f", monthlyInterest)+"\t\t"+String.format("%.2f", principle)+"\t\t"+String.format("%.2f", balance));
        }
    }
}
