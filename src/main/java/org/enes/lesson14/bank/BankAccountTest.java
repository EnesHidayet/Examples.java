package org.enes.lesson14.bank;

public class BankAccountTest {
    public static void main(String[] args) {
        BankRepository repository=new BankRepository();
        repository.faizOrani(100000);
        repository.faizOrani(200000);
        repository.faizOrani(300000);

        DB db=new DB();
        repository.getInformation(db.save);
    }
}
