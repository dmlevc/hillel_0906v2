package ua.hillel.homework.hmw18;
public class PrivatePerson extends Client {
    public PrivatePerson() {
    }
    public PrivatePerson(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        setAccountMoney(super.getAccountMoney() + sum);
        System.out.print("Add to account with commission " + sum + " usd\n");
    }

    @Override
    public void takeMoney(double sum) {
        System.out.print("Withdraw with commission " + sum + " usd\n");
        setAccountMoney(super.getAccountMoney() - sum);
    }

    @Override
    public void aboutAccount() {
        System.out.println("Private Person");
        System.out.println("Balance " + this.getAccountMoney() + " usd");
    }
}
