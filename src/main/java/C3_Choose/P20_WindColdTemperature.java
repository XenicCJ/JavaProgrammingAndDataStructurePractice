package C3_Choose;

import java.util.Scanner;

/**
 * 温度在华氏-58 - 41之间，风速>=2时计算风寒温度，否则显示非法数值
 */
public class P20_WindColdTemperature {
    public static void main(String[] args) {
        double fahrenheitTemperature;
        double windSpeed;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter fahrenheit temperature: ");
        fahrenheitTemperature=input.nextDouble();
        System.out.print("Enter wind speed: ");
        windSpeed=input.nextDouble();

        if(windSpeed>=2&&fahrenheitTemperature>=-58&&fahrenheitTemperature<=41){
            double windColdTemperature=35.74+0.6215*fahrenheitTemperature-35.75*Math.pow(windSpeed,0.16)+0.4275*fahrenheitTemperature*Math.pow(windSpeed,0.16);
            System.out.println("Wind cold temperature is "+windColdTemperature);
        }else {
            System.out.println("Invalid data.");
        }
    }
}
