package C9_ObjectAndClass;

/**
 * a class record stock info
 */
public class P2_StockClass {
    //code of stock
    private String symbol="";
    //name of stock
    private String name="";
    //stock value of last day
    private double previousClosingPrice=0;
    //current price of stock
    private double currentPrice=0;

    public P2_StockClass(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public double getChangePercent(){
        return (currentPrice-previousClosingPrice)/previousClosingPrice*100;
    }
}
