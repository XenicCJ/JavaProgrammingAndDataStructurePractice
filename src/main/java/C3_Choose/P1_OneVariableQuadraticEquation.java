package C3_Choose;

import java.util.Scanner;

/**
 * 输入一元二次方程的三个系数值，来计算方程结果值
 */
public class P1_OneVariableQuadraticEquation {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a,b,c: ");
        a=input.nextDouble();
        b=input.nextDouble();
        c=input.nextDouble();

        double judge=b*b-4*a*c;
        if(judge>0){
            System.out.println("This equation has 2 real roots: "+(-b+Math.pow(judge,0.5))/(2*a)+", "+(-b-Math.pow(judge,0.5))/(2*a));
        }else if(judge==0){
            System.out.println("This equation has 1 real roots: "+(-b)/(2*a));
        }else{
            System.out.println("This equation has no real roots.");
        }
    }
}
