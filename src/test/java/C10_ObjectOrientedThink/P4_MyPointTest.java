package C10_ObjectOrientedThink;

/**
 * a class about point
 */
public class P4_MyPointTest {
    public static void main(String[] args) {
        P4_MyPoint p1=new P4_MyPoint();
        P4_MyPoint p2=new P4_MyPoint(10,30.5);
        System.out.println(P4_MyPoint.distance(p1,p2));
    }
}

