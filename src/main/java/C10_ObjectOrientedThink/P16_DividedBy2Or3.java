package C10_ObjectOrientedThink;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * find first 10 50-bit decimal number that can be devided by 2 or 3
 */
public class P16_DividedBy2Or3 {
    public static void main(String[] args) {
        BigInteger num=new BigInteger(String.valueOf(1));
        BigInteger two=new BigInteger(String.valueOf(2));
        BigInteger three=new BigInteger(String.valueOf(3));
        BigInteger zero=new BigInteger(String.valueOf(0));

        for(int i=0;i<49;i++){
            num=num.multiply(new BigInteger(String.valueOf(10)));
        }

        int n=0;
        while(n<10){
            if(num.remainder(two).compareTo(zero)==0 || num.remainder(three).compareTo(zero)==0){
                n++;
                System.out.println(num);
            }
            num=num.add(new BigInteger(String.valueOf(1)));
        }
    }

}
