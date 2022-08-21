import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestCreditCalculator {
    CreditCalculator sut = new CreditCalculator();

    @BeforeEach
    public void initTest() {
        sut = new CreditCalculator();
    }

    @Test
    public void testCountOfMonthPay() {
        int summOfCredit = 100000;
        int periodOfCreditByMonth = 36;
        double interestRate = 20;

        double testResult = 4444.44;

        double result = sut.countOfMonthPay(summOfCredit, periodOfCreditByMonth, interestRate);
        assertTrue(Math.abs(testResult - result) < 0.01);
    }

    @Test
    public void testCountSummToReturn() {
        int summOfCredit = 200000;
        int periodOfCreditByMonth = 24;
        double interestRate = 10;

        double testResult = 240000;

        double result = sut.SummToReturn(summOfCredit, periodOfCreditByMonth, interestRate);
        assertTrue(Math.abs(testResult - result) < 0.01);
    }

    @Test
    public void testCountOfOverPayment() {
        int summOfCredit = 300000;
        int periodOfCreditByMonth = 48;
        double interestRate = 5;

        double testResult = 60000;

        double result = sut.countOfOverPayment(summOfCredit, periodOfCreditByMonth, interestRate);
        assertTrue(Math.abs(testResult - result) < 0.01);
    }
}
