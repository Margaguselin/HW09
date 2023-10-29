public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount(String accountNumber, double balance) {
        super(accountNumber, balance);
    }

    @Override
    public void interestRateCount() {
        balance += (balance / 100) * interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

}
