package C4_MathFunctionCharString;

import java.util.Scanner;

/**
 * 输入三个城市名称，按字母顺序排序后输出
 */
public class P24_CityOrder {
    public static void main(String[] args) {
        String city1,city2,city3,temp;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter the first city: ");
        city1=input.nextLine();
        System.out.print("Enter the second city: ");
        city2=input.nextLine();
        System.out.print("Enter the third city: ");
        city3=input.nextLine();

        if (city1.compareTo(city2)>0) {
            temp=city1;
            city1=city2;
            city2=temp;
        }
        if (city2.compareTo(city3)>0) {
            temp=city2;
            city2=city3;
            city3=temp;
        }
        if (city1.compareTo(city2)>0) {
            temp=city1;
            city1=city2;
            city2=temp;
        }

        System.out.println("The three cities in alphabet order are: "+city1+" "+city2+" "+city3);
    }
}
