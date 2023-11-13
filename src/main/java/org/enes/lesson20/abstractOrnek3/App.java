package org.enes.lesson20.abstractOrnek3;

import java.util.Scanner;

/*
1 Database s�n�f�m�z var
databse s�n�f� ba�lant� i�in username ve password de�erlerini bar�nd�r�yor
ayr�ca database s�n�f�m�z�n davran��lar� olarak
veri ekle
veri sil
veri g�ncelle
verileri getir
bizim �irketimizde kullan�labilecek databaselerde PostgreSlq MongoDb olsun

2- birde databaseleri y�neten manager s�n�f�m�z olsun
manager s�n�f�m�zda databaseye ba�lant� (login) olal�m
ve bu s�n�f�m�zda bir men� ile yukar�daki i�lemleri se�elim

1- Veri ekle
2- Veri sil
3- Veri g�ncelle
4- Verileri getir
0- �IKI�

daha sonra bu men�den i�lemse�ti�imiz zaman bizim �irketimiz hangi databasei kullan�yorsa o database in metodlar� �al��s�n.


1- Database ve gerekli alt s�n�flar� olu�tural�m databaselerimizin metodlar�n� yazal�m.Bu metodlar her s�n�fta farkl� bir i�lem g�r�cek �ekilde d���n�lmelidir.

App s�n�f�nda database se� metodu olsun.D��ar�dan string bir ifade database ismi alal�m kullan�c� kendi databaseini se�sin
e�er postgre girmi� ise database manager postgreyi y�netsin
e�er mongodb girmi� ise mongo db yyi y�netsin.
�nce app s�n�f�n�n main metodunda se�imi yapaca��zdaha sonra manager s�n�f�ndaki �al��t�r metodunu �al��t�raca��z
�al��t�r metodumuzda menumuz ve i�lem se�imlerimiz olacak.
 */
public class App {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       Manager manager=new Manager();
       manager.uygulamayiCalistir();
    }

    public DataBase dbSec() {
        System.out.println("L�tfen se�iniz.");
        System.out.println("1- Mongo DB");
        System.out.println("2- PostgreSql");
        int dataSecim = scanner.nextInt();

        if (dataSecim == 1) {
            DataBase dataBase = new MongoDb();
            return dataBase;
        } else {
            DataBase dataBase = new PostgreSql();
            return dataBase;
        }

    }
}
