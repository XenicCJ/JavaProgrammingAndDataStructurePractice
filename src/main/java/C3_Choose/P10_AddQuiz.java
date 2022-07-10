package C3_Choose;

import java.util.Scanner;

/**
 * 随机产生两个小于100的整数，做一个加法测试
 */
public class P10_AddQuiz {
    public static void main(String[] args) {
        int number1=(int)(Math.random()*100);
        int number2=(int)(Math.random()*100);

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the answer of "+number1+"+"+number2+": " );
        int userAnswer=input.nextInt();

        if(userAnswer==number1+number2){
            System.out.println("Your answer is correct!");
        }else {
            System.out.println("Your answer is wrong!");
            System.out.println(number1+"+"+number2+"="+(number1+number2));
        }
    }
}
