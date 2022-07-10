package C10_ObjectOrientedThink;

/**
 * calculate tax and store infos
 */
public class P8_TaxTest {
    public static void main(String[] args) {
        P8_Tax taxer=new P8_Tax(3,100000);
        System.out.println(taxer.getTax());
    }
}
