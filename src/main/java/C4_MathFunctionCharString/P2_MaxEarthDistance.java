package C4_MathFunctionCharString;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

/**
 * 用户输入地球表面两个点的经纬度坐标，计算两点之间最大圆距离
 */
public class P2_MaxEarthDistance {
    public static void main(String[] args) {
        double latitude1,longitude1,latitude2,longitude2;
        final double earthRadius=6371.01;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter point 1(latitude and longitude) in degrees: ");
        latitude1=input.nextDouble();
        longitude1=input.nextDouble();
        System.out.print("Enter point 2(latitude and longitude) in degrees: ");
        latitude2=input.nextDouble();
        longitude2=input.nextDouble();

        double la1Radian=Math.toRadians(latitude1);
        double long1Radian=Math.toRadians(longitude1);
        double la2Radian=Math.toRadians(latitude2);
        double long2Radian=Math.toRadians(longitude2);

        double distance=earthRadius*Math.acos(Math.sin(la1Radian)*Math.sin(la2Radian)+Math.cos(la1Radian)*Math.cos(la2Radian)*Math.cos(long1Radian-long2Radian));

        System.out.println("The distance between two points is "+distance+" km.");
    }
}
