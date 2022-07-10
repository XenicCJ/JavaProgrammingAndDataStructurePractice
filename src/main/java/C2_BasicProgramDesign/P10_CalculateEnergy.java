package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 根据输入的水的质量，初始温度，最终温度，计算水吸收的能量
 */
public class P10_CalculateEnergy {
    public static void main(String[] args) {
        double mass,initialTemperature,finalTemperature,energy;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the amount of water in kilograms: ");
        mass=input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        initialTemperature=input.nextDouble();
        System.out.print("Enter the final temperature: ");
        finalTemperature=input.nextDouble();

        energy=mass*(finalTemperature-initialTemperature)*4184;
        System.out.println("The energy needed is "+energy);
    }
}
