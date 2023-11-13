package org.enes.lesson20.abstractOrnek3;

import java.util.Scanner;

/*
1 Database sýnýfýmýz var
databse sýnýfý baðlantý için username ve password deðerlerini barýndýrýyor
ayrýca database sýnýfýmýzýn davranýþlarý olarak
veri ekle
veri sil
veri güncelle
verileri getir
bizim þirketimizde kullanýlabilecek databaselerde PostgreSlq MongoDb olsun

2- birde databaseleri yöneten manager sýnýfýmýz olsun
manager sýnýfýmýzda databaseye baðlantý (login) olalým
ve bu sýnýfýmýzda bir menü ile yukarýdaki iþlemleri seçelim

1- Veri ekle
2- Veri sil
3- Veri güncelle
4- Verileri getir
0- ÇIKIÞ

daha sonra bu menüden iþlemseçtiðimiz zaman bizim þirketimiz hangi databasei kullanýyorsa o database in metodlarý çalýþsýn.


1- Database ve gerekli alt sýnýflarý oluþturalým databaselerimizin metodlarýný yazalým.Bu metodlar her sýnýfta farklý bir iþlem görücek þekilde düþünülmelidir.

App sýnýfýnda database seç metodu olsun.Dýþarýdan string bir ifade database ismi alalým kullanýcý kendi databaseini seçsin
eðer postgre girmiþ ise database manager postgreyi yönetsin
eðer mongodb girmiþ ise mongo db yyi yönetsin.
önce app sýnýfýnýn main metodunda seçimi yapacaðýzdaha sonra manager sýnýfýndaki çalýþtýr metodunu çalýþtýracaðýz
çalýþtýr metodumuzda menumuz ve iþlem seçimlerimiz olacak.
 */
public class App {
    Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
       Manager manager=new Manager();
       manager.uygulamayiCalistir();
    }

    public DataBase dbSec() {
        System.out.println("Lütfen seçiniz.");
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
