package ua.hillel.homework.hmw18;

public class LegalEntity extends Client {
    public LegalEntity() {
    }
    public LegalEntity(double startDeposit) {
        super(startDeposit);
    }

    @Override
    public void addMoney(double sum) {
        System.out.print("Add to account with commission " + sum + " usd\n");
        setAccountMoney(super.getAccountMoney() + sum);
    }

    @Override
    public void takeMoney(double sum) {
        double takeOutWithTax = sum * 1.01;
        System.out.print("Withdraw with commission " + sum + " usd\n");
        if (getAccountMoney() > sum) {
            setAccountMoney(super.getAccountMoney() - sum);
        } else {
            System.out.println("You do not have enough money. Your balance: " + this.getAccountMoney() + " usd");
        }
    }

    @Override
    public void aboutAccount() {
        System.out.println("Legal entity");
        System.out.println("Balance " + this.getAccountMoney() + " usd");
    }
}
