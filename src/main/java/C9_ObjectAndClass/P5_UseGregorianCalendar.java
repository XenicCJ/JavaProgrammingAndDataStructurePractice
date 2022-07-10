package C9_ObjectAndClass;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * use gregorian calendar
 */
public class P5_UseGregorianCalendar {
    public static void main(String[] args) {
        GregorianCalendar gc=new GregorianCalendar();
        System.out.println("Current time: "+gc.get(GregorianCalendar.YEAR)+"/"+gc.get(GregorianCalendar.MONTH)+"/"+gc.get(GregorianCalendar.DAY_OF_MONTH));

        gc.setTimeInMillis(1234567898765L);
        System.out.println("A time: "+gc.get(GregorianCalendar.YEAR)+"/"+gc.get(GregorianCalendar.MONTH)+"/"+gc.get(GregorianCalendar.DAY_OF_MONTH));
    }
}
