package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 读入圆柱体半径和高，输出体积
 */
public class P2_CylinderVolume {
    public static void main(String[] args) {
        double radius,length,area,volume;

        Scanner input=new Scanner(System.in);

        System.out.print("Enter the radius and length of a cylinder:");
        radius=input.nextDouble();
        length=input.nextDouble();

        area=Math.PI*Math.pow(radius,2);
        volume=area*length;

        System.out.println("The area is "+area);
        System.out.println("The volume is "+volume);
    }
}
