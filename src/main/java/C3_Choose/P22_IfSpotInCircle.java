package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入一个坐标点xy，判断该点是否在一个半径为10，圆心在原点的圆内
 */
public class P22_IfSpotInCircle {
    public static void main(String[] args) {
        double x,y;
        Scanner input=new Scanner(System.in);

        System.out.print("Input x and y of this spot: ");
        x=input.nextDouble();
        y=input.nextDouble();

        double spotDistanceToOriginSpot=Math.pow(x*x+y*y,0.5);
        if(spotDistanceToOriginSpot<=10){
            System.out.println("The spot ("+x+","+y+") is in circle.");
        }else{
            System.out.println("The spot ("+x+","+y+") is not in circle.");
        }
    }
}
