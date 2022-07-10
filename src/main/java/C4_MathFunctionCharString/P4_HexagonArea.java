package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 用户输入六边形边长，输出面积
 */
public class P4_HexagonArea {
    public static void main(String[] args) {
        double sideLength;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter length of side: ");
        sideLength=input.nextDouble();

        double area=6*sideLength*sideLength/4/Math.tan(Math.PI/6);

        System.out.println("The area of the hexagon is "+area+".");
    }
}
