package heranca.entities;

public final class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(Double newBalance) {
        balance += balance * interestRate;
    }

    @Override
    public void withdraw(Double amount) {
        balance -= amount;
    }
}
