package C5_Loop;

import java.util.Random;

/**
 *  修改程序清单3-8产生一个数字不同的两位彩票
 */
public class P32_NewLottery {
    public static void main(String[] args) {
        int lotteryNumber;
        do{
            lotteryNumber=(int)(Math.random()*100);
        }while(lotteryNumber%10==lotteryNumber/10);

        System.out.println(lotteryNumber);
    }
}
