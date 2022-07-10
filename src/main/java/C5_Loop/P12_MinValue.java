package C5_Loop;

/**
 * 用while找出平方值大于12000的最小整数
 */
public class P12_MinValue {
    public static void main(String[] args) {
        int number=1;
        while (Math.pow(number,2)<=12000) {
            number++;
        }
        System.out.println("Minimum number is "+number);
    }
}
