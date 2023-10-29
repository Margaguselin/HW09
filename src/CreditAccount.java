public class CreditAccount extends BankAccount {
    private double maxCreditLimit;
    private double interestRate;

    public double getMaxCreditLimit() {
        return maxCreditLimit;
    }

    public void setMaxCreditLimit(double maxCreditLimit) {
        this.maxCreditLimit = maxCreditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


    public CreditAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void interestRateCount() {

    }

    @Override
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > maxCreditLimit) {
            throw new IllegalArgumentException("Maximum loan amount limit has been exceeded");
        }
        amount += (amount / 100) * interestRate;
        super.withdraw(amount);

    }


}
