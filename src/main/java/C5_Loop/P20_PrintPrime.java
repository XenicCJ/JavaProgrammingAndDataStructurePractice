package C5_Loop;

/**
 * 输出所有1000内的素数，每行8个
 */
public class P20_PrintPrime {
    public static void main(String[] args) {
        int lineNumber=0;
        boolean isPrime=true;
        for(int i=2;i<=1000;i++){
            isPrime=true;
            for(int j=2;j<=Math.sqrt(i);j++){
                if(i%j==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(i+" ");
                lineNumber++;
                if(lineNumber>=8){
                    System.out.println();
                    lineNumber=0;
                }
            }
        }
    }
}
