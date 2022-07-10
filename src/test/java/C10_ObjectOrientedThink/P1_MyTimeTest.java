package C10_ObjectOrientedThink;

/**
 * make a time class of my own
 */
public class P1_MyTimeTest {
    public static void main(String[] args) {
        P1_MyTime time1=new P1_MyTime();
        System.out.println(time1.getTime());

        P1_MyTime time2=new P1_MyTime(555550000L);
        System.out.println(time2.getTime());
    }
}
