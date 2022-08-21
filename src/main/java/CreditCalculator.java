public class CreditCalculator {

    private final static int monthInYear = 12;
    private final static int interests = 100;

    public double countOfMonthPay(int summOfCredit, int periodOfCreditByMonth, double interestRate) {
        return summOfCredit * ((interests + interestRate * periodOfCreditByMonth / monthInYear) / interests) / periodOfCreditByMonth;
    }

    public double SummToReturn(int summOfCredit, int periodOfCreditByMonth, double interestRate) {
        return summOfCredit * ((interests + interestRate * periodOfCreditByMonth / monthInYear) / interests);
    }

    public double countOfOverPayment(int summOfCredit, int periodOfCreditByMonth, double interestRate) {
        return summOfCredit * ((interests + interestRate * periodOfCreditByMonth / monthInYear) / interests) - summOfCredit;
    }
}
