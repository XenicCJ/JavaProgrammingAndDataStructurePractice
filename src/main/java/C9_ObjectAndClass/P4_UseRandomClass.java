package C9_ObjectAndClass;

import java.util.Random;

/**
 * use random class
 */
public class P4_UseRandomClass {
    public static void main(String[] args) {
        Random r=new Random(1000);
        for(int i=0;i<50;i++){
            System.out.println(r.nextInt(100));
        }
    }
}
