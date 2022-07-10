package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入两个矩形的中心坐标和宽高，判断第二个矩形是否在第一个矩形内或否是有重叠
 */
public class P28_IfTwoRectangleRelated {
    public static void main(String[] args) {
        double x1,y1,width1,height1,x2,y2,width2,height2;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter 1-st rectangle's x-,y-coordinates, width and height: ");
        x1=input.nextDouble();
        y1=input.nextDouble();
        width1=input.nextDouble();
        height1=input.nextDouble();
        System.out.print("Enter 2-nd rectangle's x-,y-coordinates, width and height: ");
        x2=input.nextDouble();
        y2=input.nextDouble();
        width2=input.nextDouble();
        height2=input.nextDouble();

        if(x1-width1/2<=x2-width2/2 && x1+width1/2>=x2+width2/2 && y1+height1/2>=y2+height2/2 && y1-height1/2<=y2-height2/2){
            System.out.println("r2 is inside r1.");
        } else if (Math.abs(x1-x2)<(width1+width2)/2 || Math.abs(y1-y2)<(height1+height2)/2) {
            System.out.println("r2 overlaps r1. ");
        }else{
            System.out.println("r2 does not overlaps r1. ");
        }
    }
}
