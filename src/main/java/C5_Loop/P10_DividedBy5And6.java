package C5_Loop;

/**
 * 输出100到1000之间可以被5和6整除的数，每行10个
 */
public class P10_DividedBy5And6 {
    public static void main(String[] args) {
        int lineNumber=0;
        for(int i=100;i<1000;i++){
            if(i%5==0&&i%6==0){
                if(lineNumber>=10){
                    lineNumber=0;
                    System.out.println();
                }
                System.out.print(i+" ");
                lineNumber++;
            }
        }
    }
}
