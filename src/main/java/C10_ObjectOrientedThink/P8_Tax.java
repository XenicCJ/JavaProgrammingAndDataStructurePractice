package C10_ObjectOrientedThink;

/**
 * calculate tax and store infos
 */
public class P8_Tax {
    int fillingStatus=0;
    int[][] brackets={
            {27050,45200,22600,36250},
            {65550,109250,54625,93650},
            {136750,166500,83250,151650},
            {297350,297350,148675,297350}
    };
    double[] rates={0.15,0.275,0.305,0.355,0.391};
    double taxableIncome=0;

    public P8_Tax(double taxableIncome){
        this.taxableIncome=taxableIncome;
    }

    public P8_Tax(int fillingStatus, double taxableIncome) {
        this.fillingStatus = fillingStatus;
        this.taxableIncome = taxableIncome;
    }

    public P8_Tax(int fillingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.fillingStatus = fillingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public double getTax(){
        if(rates.length- brackets.length!=1){
            return 0;
        }
        double tax=0;
        for(int i=0;i<brackets.length;i++){
            if(taxableIncome<=brackets[i][fillingStatus]){
                if(i==0){
                    tax+=taxableIncome*rates[0];
                }else{
                    tax+=(taxableIncome-brackets[i-1][fillingStatus])*rates[i];
                }
                return tax;
            }else{
                if(i==0){
                    tax+=brackets[0][fillingStatus]*rates[0];
                }else{
                    tax+=(brackets[i][fillingStatus]-brackets[i-1][fillingStatus])*rates[i];
                }
            }
        }
        tax+=(taxableIncome-brackets[brackets.length-1][fillingStatus])*rates[rates.length-1];
        return tax;
    }

    public int getFillingStatus() {
        return fillingStatus;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }
}
