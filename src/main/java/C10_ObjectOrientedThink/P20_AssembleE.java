package C10_ObjectOrientedThink;

import java.math.BigDecimal;

/**
 * calculate value e with BigDecimal for higher precise
 */
public class P20_AssembleE {
    public static void main(String[] args) {
        System.out.println(assembleE(10,100));
        System.out.println(assembleE(100,1000));
        System.out.println(assembleE(1000,10000));
    }

    public static BigDecimal assembleE(int n,int len){
        BigDecimal value=new BigDecimal(1);
        BigDecimal base=new BigDecimal(1);
        for(int i=1;i<=n;i++){
            base=base.multiply(new BigDecimal(i));
            value=value.add((new BigDecimal(1)).divide(base,len,BigDecimal.ROUND_UP));
        }
        return value;
    }
}
