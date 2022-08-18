package test;

public class BankAccount {

    private double balance;
    private double minimumBalance;
    private boolean isActive = true;

    private String holderName;

    public BankAccount(double balance, double minimumBalance) {
        this.balance = balance;
        this.minimumBalance = minimumBalance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getHolderName() {
        return holderName;
    }

    public double withdraw(double amount) {

        if (balance - amount > minimumBalance) {
            balance -= amount;
            return amount;
        } else throw new RuntimeException();
    }

    public double deposit(double amount) {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {

        }
        return balance += amount;
    }
}
