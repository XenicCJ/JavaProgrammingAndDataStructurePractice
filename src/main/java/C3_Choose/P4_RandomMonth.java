package C3_Choose;

import java.lang.invoke.SwitchPoint;

/**
 * 产生一个1到12间的随机数，并以此显示对应月份
 */
public class P4_RandomMonth {
    public static void main(String[] args) {
        int monthNum=(int)(Math.random()*12+1);
        if(monthNum==13) monthNum=12;

        switch(monthNum){
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not available");
                break;
        }
    }
}
