package C9_ObjectAndClass;

import com.sun.scenario.effect.light.SpotLight;

/**
 * a class tests regular polygons
 */
public class P9_RegularPolygonTest {
    public static void main(String[] args) {
        P9_RegularPolygon polygon1=new P9_RegularPolygon();
        P9_RegularPolygon polygon2=new P9_RegularPolygon(6,4);
        P9_RegularPolygon polygon3=new P9_RegularPolygon(10,4,5.6,7.8);

        System.out.println("polygon1 perimeter: "+ polygon1.getPerimeter()+", area: "+polygon1.getArea());
        System.out.println("polygon2 perimeter: "+ polygon2.getPerimeter()+", area: "+polygon2.getArea());
        System.out.println("polygon3 perimeter: "+ polygon3.getPerimeter()+", area: "+polygon3.getArea());
    }
}
