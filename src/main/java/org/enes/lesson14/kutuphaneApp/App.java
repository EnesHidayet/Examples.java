package org.enes.lesson14.kutuphaneApp;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1- k�t�phanemiz olacak k�t�phaneyi DB gibi d���nece�iz
 * 2- Kitaplar�m�z olacak
 * 3- Yazarlar�m�z olacak
 *
 *
 * 4- App s�n�f�m�zda bir men� olu�taraca��z...->
 * ..1- Kitap ekle
 * ..2- Kitap ��kar
 * ..3- Kitap listele
 * ..4- Kitap bul (isme g�re)
 * ..5- Yazar�n kitab�n� bul
 * ..0- �IKI�
 *
 *
 * 5- Bir i�lem se�ip bize geri d�nen bir metod yazal�m.
 * 6- uygulamayiBaslat metodu t�m i�lemler bu metotda yap�lacak
 * 7- Bu s�n�fta kitap bilgilerini gir adl� metot yazal�m d��ar�dan gerekli kitap bilgilerini al�p bir kitap olu�tursun
 * 8- kitaplar� gir metodunda olu�turdu�umuz kitab� k�t�ohaneManager s�n�f�nda olu�turaca��m�z kitap ekle metoduna g�nderelim
 * daha sonra kitapekle metodunda gelen kitab� gelen kitab� k�t�phanedeki kitaplar arrayine ekleyelim
 * 9- app s�n�f�nda bir kitapListele s�n�f� olsun kutuphaneManagerda olu�turdu�umuz kitaplar� getir metodundan d�nen arrayi yazd�rs�n.
 * 10- kitap bul metodu yaz�caz d��ar�dan al�nan kitap ismi alaca��z bu metot k�t�phane manager ile ileti�ime ge�ip kitaplar arrayinde bu
 * kitap var m� kontrol edicek e�er var ise kitab� d�ns�n yok ise null d�ns�n... daha sonra kitap var ise kitapBilgileri g�ster
 * metodu �al��s�n e�er yok ise kitap bulunadamad� yazs�n.
 *11- Kitap ismine g�re arrayimizden kitab� silece�iz
 * ==> App s�n�f�nda kitapC�kar diye bir metod yazal�m ve bu kullan�c�dan bir kitap ismi als�n
 * daha sonra o kitap var m� diye kontrol etsin var ise kitaplar arrayinden silen metoda y�nelsin
 */
public class App {
    KutuphaneManager save=new KutuphaneManager();


    Scanner scanner=new Scanner(System.in);



    public void menu(){
        System.out.println("********* -- K�T�PHANE UYGULAMASI -- *********");
        System.out.println("1-Kitap ekle");
        System.out.println("2-Kitap ��kar");
        System.out.println("3-Kitap Listele");
        System.out.println("4-Kitap Bul");
        System.out.println("5 Yazar�n ismine g�re kitap bul");
        System.out.println("0- � I K I �");
    }


    public int secimYap(){
        menu();


        System.out.println("L�tfen i�lem se�iniz...:");
        int secim=scanner.nextInt();
        scanner.nextLine();
        return secim;
    }


    public void uygulamayiBaslat(){
        int secim;
        KutuphaneManager save=new KutuphaneManager();
        do {
            secim=secimYap();
           switch (secim){
               case 1:
                   kitapBilgileriniGir();
                   System.out.println("Kitap eklendi..."); break;
               case 2:
                   kitapSil();
                   System.out.println("Kitap ��kar�ld�...");break;
               case 3:
                   kitaplariListele();
                   System.out.println("Kitaplar listelendi...");break;
               case 4:
                    kitapBul();
                   System.out.println("Kitap bulundu...");break;
               case 5:
                   System.out.println("Arad���n�z yazar�n kitab� bulundu...");break;
               case 0:
                   System.out.println("��k�� yap�ld�...");break;
               default:
                   System.out.println("L�tfen ge�erli bir se�im yap�n�z...");break;
           }
        }while (secim!=0);

    }


    public void kitapBilgileriniGir(){

        Kitap kitap=new Kitap();
        kitap.id= Kutuphane.kitapIndex+1;

        System.out.println("Kitap ad� giriniz...");
        kitap.ad=scanner.nextLine();

        System.out.println("Kitap t�r�n� giriniz...");
        kitap.turu=scanner.nextLine();

        System.out.println("Kitap dilini giriniz...");
        kitap.dil=scanner.nextLine();

        System.out.println("Kitab�n yazar�n� giriniz...");
        kitap.yazar=scanner.nextLine();

        System.out.println("Kitap sayfa say�s�n� giriniz...");
        kitap.sayfaSayisi=scanner.nextInt();

        save.kitapEkle(kitap);

        System.out.println(kitap.ad+" adl� kitap k�t�phaneye eklendi..."+kitap.id);




    }


    public void kitaplariListele(){
        Kitap [] kitaplar=KutuphaneManager.kitaplariGetir();

        for (Kitap kitap:kitaplar){
            if (kitap!=null){
            kitap.bilgileriGoster();
            }else {
                System.out.println("null");
            }

        }


    }

    public Kitap kitapBul(){
        System.out.println("Arad���n�z kitab�n ad�n� giriniz...");
        String aranan= scanner.nextLine();
        Kitap kitap=save.kitapVarMi(aranan);
        if (kitap!=null){
            kitap.bilgileriGoster();
            return kitap;
        }else {
            System.out.println("Arad���n�z kitap bulunamad�.");
        }
        return kitap;
    }

    public void kitapSil(){
        System.out.println("Arad���n�z kitab�n ad�n� giriniz...");
        String aranan= scanner.nextLine();
        int index=save.kitapVarMi2(aranan);
        if (index!=-1){
            save.kitapCikar(index);
        }else System.out.println("Arad���n�z kitap bulunamad�.");
    }


    public void kitapSil2(){
        Kitap kitap=kitapBul();
        if (kitap!=null){
            //silme i�lemi

        }else {
            System.out.println("Arad���n�z kitap bulunamad�.");
        }
    }








}
