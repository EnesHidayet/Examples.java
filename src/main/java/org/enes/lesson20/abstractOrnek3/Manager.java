package org.enes.lesson20.abstractOrnek3;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Manager{
    App app=new App();
    Scanner scanner = new Scanner(System.in);



    public void login(){
        MongoDb mongoDb=new MongoDb();
        System.out.println("Lütfen username giriniz.");
        String username=scanner.nextLine();
        mongoDb.setUserName(username);
        System.out.println("Lütfen þifrenizi giriniz.");
        String password=scanner.nextLine();
        mongoDb.setPassword(password);
        System.out.println("Giriþ baþarýlý sýradaki adýma geçiyoruz");
    }



    public int menu() {
        System.out.println("**** DATABASE MENÜSÜNE HOÞGELDÝNÝZ ****");
        System.out.println("1- VERÝ EKLE");
        System.out.println("2- VERÝ SÝL");
        System.out.println("3- VERÝ GÜNCELLE");
        System.out.println("4- VERÝLERÝ GETÝR");
        System.out.println("0- Ç I K I Þ");
        int secim = scanner.nextInt();

        return secim;
    }


    public void uygulamayiCalistir() {
        login();

        DataBase gelen = app.dbSec();

        int menuSecim = menu();
        do {

            switch (menuSecim) {
                case 1:
                    gelen.veriEkle();
                    break;
                case 2:
                    gelen.veriSil();
                    break;
                case 3:
                    gelen.veriGuncelle();
                    break;
                case 4:
                    gelen.verileriGetir();
                    break;
                case 0:
                    System.out.println("Çýkýyoruz...");
                    ;
                    break;
            }menuSecim=scanner.nextInt();
        }while (menuSecim!=0);


    }




}
