package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入时区，通过GMT时间与时间偏移显示此时区的12小时制时间
 */
public class P30_CurrentGMTTimeWithOffset12Hours {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        long offset=input.nextByte();

        long currentMilliSecondTime=System.currentTimeMillis()+offset*3600000;

        long currentSecondTime=currentMilliSecondTime/1000;

        long currentSecond=currentSecondTime%60;

        long currentMinuteTime=currentSecondTime/60;

        long currentMinute=currentMinuteTime%60;

        long currentHourTime=currentMinuteTime/60;

        long currentHour=currentHourTime%24;

        if(currentHour<12)
            System.out.println("Current time in offset "+offset+" is "+currentHour+":"+currentMinute+":"+currentSecond+" AM");
        else {
            System.out.println("Current time in offset "+offset+" is "+currentHour%12+":"+currentMinute+":"+currentSecond+" PM");
        }
    }
}
