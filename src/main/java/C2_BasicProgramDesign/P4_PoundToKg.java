package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 将用户输入的磅重量转换为千克
 */
public class P4_PoundToKg {
    public static void main(String[] args) {
        double pounds,kilograms;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter a number in pounds: ");
        pounds=input.nextDouble();

        kilograms=pounds*0.454;
        System.out.println(pounds+" pounds is "+kilograms+" kilograms.");
    }
}
