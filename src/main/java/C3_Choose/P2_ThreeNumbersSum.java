package C3_Choose;

import java.util.Scanner;

/**
 * 产生3个随机1位整数，让用户计算三数之和并检测结果
 */
public class P2_ThreeNumbersSum {
    public static void main(String[] args) {
        long a,b,c;
        long millisTime=System.currentTimeMillis();
        a=millisTime%10;
        b=millisTime/10%10;
        c=millisTime/100%10;

        Scanner input=new Scanner(System.in);
        System.out.println("What's the result of "+a+"+"+b+"+"+c+"?");
        long userAnswer=input.nextLong();

        if(userAnswer==a+b+c){
            System.out.println("Right answer!");
        }else{
            System.out.println("Wrong answer!");
        }
    }
}
