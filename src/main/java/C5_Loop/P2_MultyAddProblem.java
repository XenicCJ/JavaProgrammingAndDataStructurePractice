package C5_Loop;

import java.util.Scanner;

/**
 * 产生10个加法问题，加数是1-15的整数，显示正确答案的个数和完成测试时间
 */
public class P2_MultyAddProblem {
    public static void main(String[] args) {
        int addNumber1,addNumber2;
        int inputAnswer;
        int score=0;
        long startTime=System.currentTimeMillis();
        long endTime;
        Scanner input=new Scanner(System.in);

        for(int i=0;i<10;i++){
            addNumber1=(int)(Math.random()*15+1);
            addNumber2=(int)(Math.random()*15+1);
            System.out.print("The answer of "+addNumber1+"+"+addNumber2 +" is:  ");
            inputAnswer=input.nextInt();
            if(addNumber1+addNumber2==inputAnswer){
                score++;
            }
        }

        endTime=System.currentTimeMillis();
        int secondTime=(int)(endTime-startTime)/1000;
        int milliSecondTime=(int)(endTime-startTime)%1000;
        System.out.println("You answered "+score+" right questions in "+secondTime+" seconds "+milliSecondTime+" milliseconds.");
    }
}
