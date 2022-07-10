package C5_Loop;

/**
 * 找出10000以内的四个完全数
 */
public class P33_CompleteNumber {
    public static void main(String[] args) {
        for(int i=2;i<10000;i++){
            int sum=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0)
                    sum+=j;
            }
            if(i==sum){
                System.out.println(i+" is a complete number.");
            }
        }
    }
}
