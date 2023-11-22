package org.enes.lesson20.abstractOrnek3;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.Scanner;

public class Manager{
    Scanner scanner = new Scanner(System.in);



    public void login(){
        MongoDb mongoDb=new MongoDb();
        System.out.println("L�tfen username giriniz.");
        String username=scanner.nextLine();
        mongoDb.setUserName(username);
        System.out.println("L�tfen �ifrenizi giriniz.");
        String password=scanner.nextLine();
        mongoDb.setPassword(password);
        System.out.println("Giri� ba�ar�l� s�radaki ad�ma ge�iyoruz");
    }



    public int menu() {
        System.out.println("**** DATABASE MEN�S�NE HO�GELD�N�Z ****");
        System.out.println("1- VER� EKLE");
        System.out.println("2- VER� S�L");
        System.out.println("3- VER� G�NCELLE");
        System.out.println("4- VER�LER� GET�R");
        System.out.println("0- � I K I �");
        int secim = scanner.nextInt();

        return secim;
    }


    public void uygulamayiCalistir(DataBase dataBase) {
        login();

        DataBase gelen = dataBase;

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
                    System.out.println("��k�yoruz...");
                    ;
                    break;
            }menuSecim=scanner.nextInt();
        }while (menuSecim!=0);


    }




}
