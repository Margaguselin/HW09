public class CheckingAccount extends BankAccount {


    private double transactionLimit;

    public CheckingAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void interestRateCount() {
    }

    public void increaseLimit(double amount) {
        transactionLimit += amount;
    }

    public void decreaseLimit(double amount) {
        transactionLimit -= amount;
    }

    public double getTransactionLimit() {
        return transactionLimit;
    }

    public void setTransactionLimit(double transactionLimit) {
        this.transactionLimit = transactionLimit;
    }

    @Override
    public void withdraw(double amount) throws IllegalArgumentException {
        if (amount > transactionLimit) {
            throw new IllegalArgumentException("maximum amount limit exceeded");
        }
        super.withdraw(amount);

    }
}
