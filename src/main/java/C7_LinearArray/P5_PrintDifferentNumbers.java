package C7_LinearArray;

import java.util.Scanner;

/**
 * enter 10 numbers, show how many distinguish numbers are there, print them in order
 */
public class P5_PrintDifferentNumbers {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] numbers=new int[10];
        int distinguishAmount=0;

        System.out.print("Enter 10 numbers: ");
        for(int i=0;i<10;i++){
            int curNum=input.nextInt();
            boolean exists=false;
            for(int j=0;j<i;j++){
                if(numbers[j]==curNum){
                    exists=true;
                    break;
                }
            }
            if(!exists){
                numbers[distinguishAmount++]=curNum;
            }
        }

        System.out.println("The number of distinct numbers is "+distinguishAmount);
        System.out.print("The distinguish numbers are: ");
        for(int i=0;i<distinguishAmount;i++)
            System.out.print(numbers[i]+" ");
    }
}
