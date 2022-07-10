package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 输入摄氏度，转换为华氏度输出
 */
public class P1_CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius=input.nextDouble();
        double fahrenheit=celsius*9/5+32;

        System.out.println(celsius+" Celsius is "+fahrenheit+" in Fahrenheit.");
    }
}
