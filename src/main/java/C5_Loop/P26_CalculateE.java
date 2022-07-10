package C5_Loop;

import javax.crypto.spec.PSource;
import java.util.Scanner;

/**
 * 近似计算e的值
 */
public class P26_CalculateE {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;

        System.out.print("Enter n: ");
        n=input.nextInt();

        double e=1;
        double factorial=1;
        for(int i=1;i<=n;i++){
            e+=1/factorial;
            factorial*=(i+1);
        }

        System.out.println("e is "+e);
    }
}
