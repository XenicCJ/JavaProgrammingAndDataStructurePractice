package C10_ObjectOrientedThink;

/**
 * make a time class of my own
 */
public class P1_MyTime {
    private int hour;
    private int minute;
    private int second;

    /**
     * construct object with current time
     */
    public P1_MyTime(){
        long current=System.currentTimeMillis()/1000;
        second=(int)(current%60);
        current/=60;
        minute=(int)(current%60);
        current/=60;
        hour=(int)(current%24);
    }

    /**
     * construct object with milliseconds
     * @param currentMilli
     */
    public P1_MyTime(long currentMilli){
        long current=currentMilli/1000;
        second=(int)(current%60);
        current/=60;
        minute=(int)(current%60);
        current/=60;
        hour=(int)(current%24);
    }

    /**
     * construct object with hour,minute and second
     * @param hour
     * @param minute
     * @param second
     */
    public P1_MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(long elapseTime){
        long current=elapseTime/1000;
        second=(int)(current%60);
        current/=60;
        minute=(int)(current%60);
        current/=60;
        hour=(int)(current%24);
    }

    public String getTime(){
        return hour+":"+minute+":"+second;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }
}
