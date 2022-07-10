package C3_Choose;

import java.util.Scanner;

/**
 * 用户输入0或1表示硬币正反面，猜硬币正反面
 */
public class P14_CoinSide {
    public static void main(String[] args) {
        int guessSide;
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your guess(0 for front side, 1 for back side): ");
        guessSide=input.nextInt();

        int realSide=(int)(Math.random()+0.5);
        if(realSide==guessSide){
            System.out.println("Your guess is correct!");
        }else {
            System.out.println("Your guess is wrong!");
        }
    }
}
