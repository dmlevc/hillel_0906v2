package ua.hillel.homework.hmw18;

public class PrivateEntrepreneur extends Client {

    public PrivateEntrepreneur() {
    }

    public PrivateEntrepreneur(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        double addSum;
        if (sum < 1000) {
            addSum = sum * 0.99;
        } else {
            addSum = sum * 0.995;
        }

        setAccountMoney(super.getAccountMoney() + addSum);
        System.out.print("Add to account with commission " + sum + " usd\n");
    }

    @Override
    public void takeMoney(double sum) {
        System.out.print("Withdraw with commission " + sum + " usd\n");
        setAccountMoney(super.getAccountMoney() - sum);
    }

    @Override
    public void aboutAccount() {
        System.out.println("Private Entrepreneur");
        System.out.println("Balance " + this.getAccountMoney() + " usd");
    }
}
