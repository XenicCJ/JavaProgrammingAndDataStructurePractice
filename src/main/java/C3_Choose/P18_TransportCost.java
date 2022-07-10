package C3_Choose;

import java.util.Scanner;

/**
 * 输入包裹重量，显示运输成本，若超出范围则显示对应信息
 */
public class P18_TransportCost {
    public static void main(String[] args) {
        double packageWeight;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the weight of package(pounds): ");
        packageWeight=input.nextDouble();

        if (packageWeight<=0) {
            System.out.println("Invalid input.");
        }else if(packageWeight>0&&packageWeight<=1){
            System.out.println("Transport cost is 3.5.");
        } else if (packageWeight<=3) {
            System.out.println("Transport cost is 5.5.");
        }else if (packageWeight<=10){
            System.out.println("Transport cost is 8.5.");
        }else if(packageWeight<=20){
            System.out.println("Transport cost is 10.5.");
        }else {
            System.out.println("The package can not be shipped.");
        }
    }
}
