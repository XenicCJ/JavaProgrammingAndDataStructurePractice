package C1_ComputerProgramJavaOverview;

/**
 * evaluate USA population in 5 years, depend on following data:
 * 1 person is born per 7 seconds
 * 1 person dies per 13 seconds
 * 1 migrator per 45 seconds
 * every year have 365 days
 */
public class P11_PopulationEstimate {
    public static void main(String[] args) {
        System.out.println(312032486+(365*24*3600)/7-(365*24*3600)/13+(365*24*3600)/45);
        System.out.println(312032486+(365*24*3600*2)/7-(365*24*3600*2)/13+(365*24*3600*2)/45);
        System.out.println(312032486+(365*24*3600*3)/7-(365*24*3600*3)/13+(365*24*3600*3)/45);
        System.out.println(312032486+(365*24*3600*4)/7-(365*24*3600*4)/13+(365*24*3600*4)/45);
        System.out.println(312032486+(365*24*3600*5)/7-(365*24*3600*5)/13+(365*24*3600*5)/45);
    }
}
