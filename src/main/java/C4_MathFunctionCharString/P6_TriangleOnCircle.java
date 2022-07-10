package C4_MathFunctionCharString;

/**
 * 在一个圆心为原点，半径40的圆上，生成三个随机点，计算以这三个点组成的三角形的内角度数
 */
public class P6_TriangleOnCircle {
    public static void main(String[] args) {
        double radian1=(Math.random()*2*Math.PI);
        double radian2=(Math.random()*2*Math.PI);
        double radian3=(Math.random()*2*Math.PI);

        double x1=40*Math.cos(radian1);
        double x2=40*Math.cos(radian2);
        double x3=40*Math.cos(radian3);
        double y1=40*Math.sin(radian1);
        double y2=40*Math.sin(radian2);
        double y3=40*Math.sin(radian3);

        double aLength=Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
        double bLength=Math.sqrt((x3-x2)*(x3-x2)+(y3-y2)*(y3-y2));
        double cLength=Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));

        double aAngle=Math.acos((aLength*aLength-bLength*bLength-cLength*cLength)/(-2*bLength*cLength)) / Math.PI * 180;
        double bAngle=Math.acos((bLength*bLength-aLength*aLength-cLength*cLength)/(-2*aLength*cLength)) / Math.PI * 180;
        double cAngle=Math.acos((cLength*cLength-bLength*bLength-aLength*aLength)/(-2*bLength*aLength)) / Math.PI * 180;

        System.out.println("Random created triangle's inner angles are: "+aAngle+", "+bAngle+","+cAngle);
    }
}
