package org.enes.lesson14.kutuphaneApp;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 1- kütüphanemiz olacak kütüphaneyi DB gibi düþüneceðiz
 * 2- Kitaplarýmýz olacak
 * 3- Yazarlarýmýz olacak
 *
 *
 * 4- App sýnýfýmýzda bir menü oluþtaracaðýz...->
 * ..1- Kitap ekle
 * ..2- Kitap çýkar
 * ..3- Kitap listele
 * ..4- Kitap bul (isme göre)
 * ..5- Yazarýn kitabýný bul
 * ..0- ÇIKIÞ
 *
 *
 * 5- Bir iþlem seçip bize geri dönen bir metod yazalým.
 * 6- uygulamayiBaslat metodu tüm iþlemler bu metotda yapýlacak
 * 7- Bu sýnýfta kitap bilgilerini gir adlý metot yazalým dýþarýdan gerekli kitap bilgilerini alýp bir kitap oluþtursun
 * 8- kitaplarý gir metodunda oluþturduðumuz kitabý kütüohaneManager sýnýfýnda oluþturacaðýmýz kitap ekle metoduna gönderelim
 * daha sonra kitapekle metodunda gelen kitabý gelen kitabý kütüphanedeki kitaplar arrayine ekleyelim
 * 9- app sýnýfýnda bir kitapListele sýnýfý olsun kutuphaneManagerda oluþturduðumuz kitaplarý getir metodundan dönen arrayi yazdýrsýn.
 * 10- kitap bul metodu yazýcaz dýþarýdan alýnan kitap ismi alacaðýz bu metot kütüphane manager ile iletiþime geçip kitaplar arrayinde bu
 * kitap var mý kontrol edicek eðer var ise kitabý dönsün yok ise null dönsün... daha sonra kitap var ise kitapBilgileri göster
 * metodu çalýþsýn eðer yok ise kitap bulunadamadý yazsýn.
 *11- Kitap ismine göre arrayimizden kitabý sileceðiz
 * ==> App sýnýfýnda kitapCýkar diye bir metod yazalým ve bu kullanýcýdan bir kitap ismi alsýn
 * daha sonra o kitap var mý diye kontrol etsin var ise kitaplar arrayinden silen metoda yönelsin
 */
public class App {
    KutuphaneManager save=new KutuphaneManager();


    Scanner scanner=new Scanner(System.in);



    public void menu(){
        System.out.println("********* -- KÜTÜPHANE UYGULAMASI -- *********");
        System.out.println("1-Kitap ekle");
        System.out.println("2-Kitap Çýkar");
        System.out.println("3-Kitap Listele");
        System.out.println("4-Kitap Bul");
        System.out.println("5 Yazarýn ismine göre kitap bul");
        System.out.println("0- Ç I K I Þ");
    }


    public int secimYap(){
        menu();


        System.out.println("Lütfen iþlem seçiniz...:");
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
                   System.out.println("Kitap çýkarýldý...");break;
               case 3:
                   kitaplariListele();
                   System.out.println("Kitaplar listelendi...");break;
               case 4:
                    kitapBul();
                   System.out.println("Kitap bulundu...");break;
               case 5:
                   System.out.println("Aradýðýnýz yazarýn kitabý bulundu...");break;
               case 0:
                   System.out.println("Çýkýþ yapýldý...");break;
               default:
                   System.out.println("Lütfen geçerli bir seçim yapýnýz...");break;
           }
        }while (secim!=0);

    }


    public void kitapBilgileriniGir(){

        Kitap kitap=new Kitap();
        kitap.id= Kutuphane.kitapIndex+1;

        System.out.println("Kitap adý giriniz...");
        kitap.ad=scanner.nextLine();

        System.out.println("Kitap türünü giriniz...");
        kitap.turu=scanner.nextLine();

        System.out.println("Kitap dilini giriniz...");
        kitap.dil=scanner.nextLine();

        System.out.println("Kitabýn yazarýný giriniz...");
        kitap.yazar=scanner.nextLine();

        System.out.println("Kitap sayfa sayýsýný giriniz...");
        kitap.sayfaSayisi=scanner.nextInt();

        save.kitapEkle(kitap);

        System.out.println(kitap.ad+" adlý kitap kütüphaneye eklendi..."+kitap.id);




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
        System.out.println("Aradýðýnýz kitabýn adýný giriniz...");
        String aranan= scanner.nextLine();
        Kitap kitap=save.kitapVarMi(aranan);
        if (kitap!=null){
            kitap.bilgileriGoster();
            return kitap;
        }else {
            System.out.println("Aradýðýnýz kitap bulunamadý.");
        }
        return kitap;
    }

    public void kitapSil(){
        System.out.println("Aradýðýnýz kitabýn adýný giriniz...");
        String aranan= scanner.nextLine();
        int index=save.kitapVarMi2(aranan);
        if (index!=-1){
            save.kitapCikar(index);
        }else System.out.println("Aradýðýnýz kitap bulunamadý.");
    }


    public void kitapSil2(){
        Kitap kitap=kitapBul();
        if (kitap!=null){
            //silme iþlemi

        }else {
            System.out.println("Aradýðýnýz kitap bulunamadý.");
        }
    }








}
