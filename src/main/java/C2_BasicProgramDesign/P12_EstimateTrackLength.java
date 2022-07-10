package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 用户输入起飞速度和加速度，计算飞机起飞所需的最短跑道长度
 */
public class P12_EstimateTrackLength {
    public static void main(String[] args) {
        double speed,acceleration;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter speed and acceleration: ");
        speed=input.nextDouble();
        acceleration=input.nextDouble();

        double runwayLength=Math.pow(speed,2)/2/acceleration;
        System.out.println("The minimum runway length for this airplane is: "+runwayLength);
    }
}
