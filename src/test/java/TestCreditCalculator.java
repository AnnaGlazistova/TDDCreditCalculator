import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
        int interestRate = 20;

        int expected = 4444;

        int result = sut.countOfMonthPay(summOfCredit, periodOfCreditByMonth, interestRate);
        assertEquals(expected, result);
    }

    @Test
    public void testCountSummToReturn() {
        int summOfCredit = 200000;
        int periodOfCreditByMonth = 24;
        int interestRate = 10;

        int expected = 240000;

        int result = sut.SummToReturn(summOfCredit, periodOfCreditByMonth, interestRate);
        assertEquals(expected, result);
    }

    @Test
    public void testCountOfOverPayment() {
        int summOfCredit = 300000;
        int periodOfCreditByMonth = 48;
        int interestRate = 5;

        int expected = 60000;

        int result = sut.countOfOverPayment(summOfCredit, periodOfCreditByMonth, interestRate);
        assertEquals(expected, result);
    }
}
