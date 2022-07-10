package C3_Choose;

import java.util.regex.Matcher;

/**
 * 一个矩形宽100高200，原点位于中心，生成矩形内的随机坐标点
 */
public class P16_RandomSpot {
    public static void main(String[] args) {
        double x,y;
        x=Math.random()*100-50;
        y= Math.random()*200-100;
        System.out.println("("+x+","+y+")");
    }
}
