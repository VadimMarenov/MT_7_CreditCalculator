import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CreditCalculatorTest {

    CreditCalculator sut = new CreditCalculator(100_000, 13, 12);

    @Test
    void getPaymentPerMonthTest() {
        int expected = 8931;
        int actual = sut.getPaymentPerMonth();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void getFullCreditCostTest() {
        int expected = 107172;
        int actual = sut.getFullCreditCost();
        Assertions.assertEquals(actual, expected);
    }

    @Test
    void getCreditOverpaymentTest() {
        int expected = 7172;
        int actual = sut.getCreditOverpayment();
        Assertions.assertEquals(actual, expected);
    }
}