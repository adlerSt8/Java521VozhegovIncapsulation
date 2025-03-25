public class ChildBankAccount {

    public double getBalance() {
        return balance;
    }

    public double getMaxBalance() {
        return maxBalance;
    }

    private double balance;
    private double maxBalance;

    public ChildBankAccount(int maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (value  > 0 && balance + value <= maxBalance) {
            balance += value;
            return true;
        } else return false;
    }

    public boolean debitMoney(double value) {
        if (value > 0 && balance - value >= 0) {
            balance -= value;
            return true;
        } else return false;
    }

}
