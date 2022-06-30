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
        double creditRatePerMonth = rate / term / 100;
        double koef = (creditRatePerMonth * Math.pow(1 + creditRatePerMonth, term)) /
                (Math.pow(1 + creditRatePerMonth, term) - 1);
        int paymentPerMonth = (int) (value * koef);
        return paymentPerMonth;
    }

    public int getFullCreditCost() {
        int fullCreditCost = getPaymentPerMonth() * term;
        return fullCreditCost;
    }

    public int getCreditOverpayment() {
        int creditOverPayment = getFullCreditCost() - value;
        return creditOverPayment;
    }

}
