package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入重量，英尺，英寸，输出BMI和体型类别
 */
public class P6_BMIJudger {
    public static void main(String[] args) {
        double weightInPounds,heightFeet,heightInch;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter weight in pounds: ");
        weightInPounds=input.nextDouble();
        System.out.print("Enter height feet: ");
        heightFeet=input.nextDouble();
        System.out.print("Enter height inch: ");
        heightInch=input.nextDouble();

        double weightInKilogram=weightInPounds*0.4536;
        double heightInMeter=heightFeet*0.3048+heightInch*0.0254;
        double bmi=weightInKilogram/heightInMeter/heightInMeter;

        System.out.println("BMI is "+bmi);

        if(bmi<18.5){
            System.out.println("UnderWeight");
        }else if(bmi<25){
            System.out.println("Normal");
        }else if (bmi<30){
            System.out.println("Overweight");
        }else {
            System.out.println("Obese");
        }
    }
}
