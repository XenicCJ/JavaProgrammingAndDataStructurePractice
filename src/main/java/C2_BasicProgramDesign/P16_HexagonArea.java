package C2_BasicProgramDesign;

import java.util.Scanner;

/**
 * 输入正六边形边长，计算面积
 */
public class P16_HexagonArea {
    public static void main(String[] args) {
        double sideLength;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        sideLength=input.nextDouble();

        double area=1.5*Math.pow(3,0.5)*Math.pow(sideLength,2);
        System.out.println("The area of the hexagon is "+area);
    }
}
