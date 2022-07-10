package C5_Loop;

import java.util.Scanner;

/**
 * 输入学生数量，每个学生的名字和成绩，输出最高分的学生姓名
 */
public class P8_BestStudent {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int studentAmount,bestScore=Integer.MIN_VALUE,curScore;
        String bestStudentName="",curStudentName;

        System.out.print("Enter students amount in total: ");
        studentAmount=input.nextInt();
        for(int i=0;i<studentAmount;i++){
            System.out.print("Enter student name: ");
            curStudentName=input.next();
            System.out.print("Enter student score: ");
            curScore=input.nextInt();
            if (curScore>bestScore) {
                bestScore=curScore;
                bestStudentName=curStudentName;
            }
        }

        System.out.println("Best student name: "+bestStudentName+", best score is "+bestScore);
    }
}
