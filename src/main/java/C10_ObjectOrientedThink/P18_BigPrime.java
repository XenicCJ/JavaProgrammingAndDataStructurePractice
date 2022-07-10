package C10_ObjectOrientedThink;

import java.math.BigInteger;

/**
 * find 5 prime numbers that are bigger than long.MAX_VALUE
 */
public class P18_BigPrime {
    public static void main(String[] args) {
        BigInteger num=new BigInteger(String.valueOf(Long.MAX_VALUE));
        num=num.add(new BigInteger("1"));

        int n=0;
        while(n<5){
            if(isBigPrime(num)){
                System.out.println(num);
                n++;
            }
            num=num.add(new BigInteger("1"));
        }
    }

    /**
     * check if num is a big prime
     * @param i
     * @return
     */
    public static boolean isBigPrime(BigInteger i) {
        for( BigInteger divisor1=new BigInteger("2");divisor1.compareTo(i.divide(new BigInteger("2")))<=0;divisor1=divisor1.add(BigInteger.ONE)) {
            if(i.remainder(divisor1).compareTo(BigInteger.ZERO)==0)
                return false;
        }
        return true;
    }
}
