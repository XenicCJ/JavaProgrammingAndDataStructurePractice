package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 输入体重和身高，分别以磅和英尺为单位，计算BMI
 */
public class P14_CalculateBMI {
    public static void main(String[] args) {
        double weight,height;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        weight=input.nextDouble();
        System.out.print("Enter height in inches: ");
        height=input.nextDouble();

        double weightInKilograms=weight*0.4536;
        double heightInMeters=height*0.0254;
        double bmi=weightInKilograms/Math.pow(heightInMeters,2);
        System.out.println("BMI is "+bmi);
    }
}
