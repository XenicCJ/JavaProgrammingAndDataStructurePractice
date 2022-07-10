package C3_Choose;

import java.util.Scanner;

/**
 * 输入三个点p0,p1,p2的坐标，判断p2是否在p0与p1构成的线段上
 */
public class P34_IsSpotInSegment {
    public static void main(String[] args) {
        double x0,y0,x1,y1,x2,y2;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter 3 points for p0,p1 and p2: ");
        x0=input.nextDouble();
        y0=input.nextDouble();
        x1=input.nextDouble();
        y1=input.nextDouble();
        x2=input.nextDouble();
        y2=input.nextDouble();

        double judgeValue=(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
        if(judgeValue==0 && (x2>x0 && x2<x1 || x2<x0 && x2>x1) && (y2>y0 && y2<y1 || y2<y0 && y2>y1)){
            System.out.println("("+x2+","+y2+") is on the line segment from ("+x0+","+y0+") to ("+x1+","+y1+").");
        }else{
            System.out.println("("+x2+","+y2+") is not on the line segment from ("+x0+","+y0+") to ("+x1+","+y1+").");
        }
    }
}
