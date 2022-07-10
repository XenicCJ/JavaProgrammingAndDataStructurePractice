package C9_ObjectAndClass;

/**
 * test class
 */
public class P2_StockClassTest {
    public static void main(String[] args) {
        P2_StockClass stock=new P2_StockClass("102300","Apple");
        stock.setCurrentPrice(350);
        stock.setPreviousClosingPrice(340);
        System.out.println(String.format("%.2f",stock.getChangePercent())+"%");
    }
}
