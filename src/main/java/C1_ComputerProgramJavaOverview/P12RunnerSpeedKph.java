package C1_ComputerProgramJavaOverview;

/**
 * a runner ran 24 miles in 1hour40min35sec, calculate average speed in kph
 */
public class P12RunnerSpeedKph {
    public static void main(String[] args) {
        System.out.println((24*1.609)/(3600+40*60+35)*3600);
    }
}
