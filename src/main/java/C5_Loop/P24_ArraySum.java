package C5_Loop;

/**
 * 求数列的和
 */
public class P24_ArraySum {
    public static void main(String[] args) {
        double sum=0;
        for(int i=1;i<98;i+=2){
            sum+=i/(double)(i+2);
        }
        System.out.println("Answer: "+sum);
    }
}
