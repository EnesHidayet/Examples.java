package org.enes.lesson14.bank;

public class BankRepository {

    int musteri;

    public void faizOrani(double para){
        BankAccount bankAccount=new BankAccount();
        bankAccount.accountNumber=musteri;
        bankAccount.balance=para;
        bankAccount.newBalance=bankAccount.balance* bankAccount.interestRate;
        System.out.println("Faiz iþlendikten sonraki bakiyeniz...:"+bankAccount.newBalance);


        DB.save[musteri++]=bankAccount;

    }


    public void getInformation(BankAccount[]dizi){

        for (int i=0;i<musteri;i++){

            BankAccount bankAccount = dizi[i];
            System.out.println(bankAccount.accountNumber+" - "+bankAccount.balance+" - "+bankAccount.interestRate+" - "+bankAccount.newBalance);

        }


    }

}
