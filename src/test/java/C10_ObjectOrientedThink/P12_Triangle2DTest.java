package C10_ObjectOrientedThink;

public class P12_Triangle2DTest {
    public static void main(String[] args) {
        P12_Triangle2D t=new P12_Triangle2D(new MyPoint(2.5,2),new MyPoint(4.2,3),new MyPoint(5,3.5));
        System.out.println("Area: "+t.getArea()+" Perimeter: "+t.getPerimeter());
        System.out.println(t.contains(new MyPoint(3,3)));
        System.out.println(t.contains(new P12_Triangle2D(new MyPoint(2.9,2),new MyPoint(4,1),new MyPoint(1,3.4))));
        System.out.println(t.overlaps(new P12_Triangle2D(new MyPoint(2,5.5),new MyPoint(4,-3),new MyPoint(2,6.5))));
    }
}
