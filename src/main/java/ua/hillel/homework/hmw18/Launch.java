package ua.hillel.homework.hmw18;
public class Launch {
    public static void main(String[] args) {

        Client company = new LegalEntity(1200);
        company.myBalance();
        company.addMoney(300);
        company.takeMoney(150);
        company.aboutAccount();
        System.out.println();

        Client pe = new PrivateEntrepreneur(500);
        pe.myBalance();
        pe.addMoney(170);
        pe.takeMoney(123);
        pe.aboutAccount();
        System.out.println();

        Client person = new PrivatePerson(100);
        person.myBalance();
        person.addMoney(70);
        person.takeMoney(30);
        person.aboutAccount();


    }
}
