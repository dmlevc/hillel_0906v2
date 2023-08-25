package ua.hillel.homework.hmw18;

public abstract class Client {
    private double accountMoney;
    public Client() {
        this.accountMoney = 0.0;
    }
    public Client(double startDeposit) {
        this.accountMoney = startDeposit;
    }
    public double getAccountMoney() {
        return this.accountMoney;
    }

    public void setAccountMoney(double sum) {
        this.accountMoney = sum;
    }

    public abstract void aboutAccount();

    public abstract void addMoney(double sum);

    public abstract void takeMoney(double sum);

    public void myBalance() {
        System.out.println("Balance " + this.getAccountMoney() + " usd");
    }
}
