package C10_ObjectOrientedThink;

public class P12_Triangle2D {
    private MyPoint p1,p2,p3;

    public P12_Triangle2D(){
        p1=new MyPoint(0,0);
        p2=new MyPoint(1,1);
        p3=new MyPoint(2,5);
    }

    public P12_Triangle2D(MyPoint p1,MyPoint p2,MyPoint p3){
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
    }

    public double getArea(){
        double a=MyPoint.getDistance(p1,p2);
        double b=MyPoint.getDistance(p3,p2);
        double c=MyPoint.getDistance(p1,p3);
        double p=a+b+c;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public double getPerimeter(){
        double a=MyPoint.getDistance(p1,p2);
        double b=MyPoint.getDistance(p3,p2);
        double c=MyPoint.getDistance(p1,p3);
        return a+b+c;
    }

    public boolean contains(MyPoint p){
        double s1=new P12_Triangle2D(p,p1,p2).getArea();
        double s2=new P12_Triangle2D(p,p3,p2).getArea();
        double s3=new P12_Triangle2D(p,p1,p3).getArea();
        if(s1+s2+s3==getArea()){
            return true;
        }else {
            return false;
        }
    }

    public boolean contains(P12_Triangle2D t){
        if(contains(t.getP1())&&contains(t.getP2())&&contains(t.getP3())){
            return true;
        }else{
            return false;
        }
    }

    public boolean overlaps(P12_Triangle2D t){
        if(intersection(p1,p2,t.p1,t.p2)){
            return true;
        }
        if(intersection(p1,p2,t.p3,t.p2)){
            return true;
        }
        if(intersection(p1,p2,t.p1,t.p3)){
            return true;
        }
        if(intersection(p1,p3,t.p1,t.p2)){
            return true;
        }
        if(intersection(p1,p3,t.p3,t.p2)){
            return true;
        }
        if(intersection(p1,p3,t.p1,t.p3)){
            return true;
        }
        if(intersection(p3,p2,t.p1,t.p2)){
            return true;
        }
        if(intersection(p3,p2,t.p1,t.p3)){
            return true;
        }
        if(intersection(p3,p2,t.p3,t.p2)){
            return true;
        }
        return false;
    }

    public boolean intersection(MyPoint p0, MyPoint p1,MyPoint p2,MyPoint p3)
    {
        if ((p0.x > p1.x ? p0.x : p1.x) < (p2.x < p3.x ? p2.x : p3.x) ||
                (p0.y > p1.y ? p0.y : p1.y) < (p2.y < p3.y ? p2.y : p3.y) ||
                (p2.x > p3.x ? p2.x : p3.x) < (p0.x < p1.x ? p0.x : p1.x) ||
                (p2.y > p3.y ? p2.y : p3.y) < (p0.y < p1.y ? p0.y : p1.y))
        {
            return false;
        }
        if ((((p0.x - p2.x)*(p3.y - p2.y) - (p0.y - p2.y)*(p3.x - p2.x))*
                ((p1.x - p2.x)*(p3.y - p2.y) - (p1.y - p2.y)*(p3.x - p2.x))) > 0 ||
                (((p2.x - p0.x)*(p1.y - p0.y) - (p2.y - p0.y)*(p1.x - p0.x))*
                        ((p3.x - p0.x)*(p1.y - p0.y) - (p3.y - p0.y)*(p1.x - p0.x))) > 0)
        {
            return false;
        }
        return true;
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }
}

class MyPoint{
    double x;
    double y;

    MyPoint(double x,double y){
        this.x=x;
        this.y=y;
    }

    public static double getDistance(MyPoint p1,MyPoint p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
