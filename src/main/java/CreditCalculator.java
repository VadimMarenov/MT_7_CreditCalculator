public class CreditCalculator {
    private int value;
    private double rate;
    private int term;

    private CreditCalculator(){

    }
    public CreditCalculator(int value, double rate, int term) {
        this.value = value;
        this.rate = rate;
        this.term = term;
    }

    public int getPaymentPerMonth() {
        return 0;
    }

    public int getFullCreditCost() {
        return 0;
    }

    public int getCreditOverpayment() {
        return 0;
    }

}
