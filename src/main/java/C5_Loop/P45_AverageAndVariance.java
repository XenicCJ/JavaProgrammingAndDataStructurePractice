package C5_Loop;

import java.util.Scanner;

/**
 * 用户输入10个数字，计算这10个数字的平均值和标准差
 */
public class P45_AverageAndVariance {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double curNumber;
        double sum=0;
        double squareSum=0;

        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            curNumber=input.nextDouble();
            sum+=curNumber;
            squareSum+=curNumber*curNumber;
        }

        double average=sum/10;
        double variance=Math.pow((squareSum-sum*sum/10)/9,0.5);

        System.out.println("Average: "+average+" Standard deviation: "+variance);
    }
}
