package C5_Loop;

/**
 * 模拟投硬币100万次，显示正反面次数
 */
public class P40_HeadOrTail {
    public static void main(String[] args) {
        int headTime=0;
        int tailTime=0;

        for(int i=0;i<1000000;i++){
            double randNumber=Math.random();
            if(randNumber<0.5)
                headTime++;
            else tailTime++;
        }

        System.out.println("Head: "+headTime);
        System.out.println("Tail: "+tailTime);
    }
}
