package C10_ObjectOrientedThink;

/**
 * a class about point
 */
public class P4_MyPoint {
    private double x, y;

    public P4_MyPoint() {
        x = y = 0;
    }

    public P4_MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(P4_MyPoint point){
        return Math.sqrt(Math.pow((x-point.getX()),2)+Math.pow((y-point.getY()),2));
    }

    public double distance(double x,double y){
        return Math.sqrt(Math.pow((x-this.x),2)+Math.pow((y-this.y),2));
    }

    public static double distance(P4_MyPoint p1,P4_MyPoint p2){
        return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
    }

    //getters and setters
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

