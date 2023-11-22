package org.enes.lesson21.controller;

import org.enes.lesson21.entity.Kullanici;
import org.enes.lesson21.entity.Sepet;
import org.enes.lesson21.enums.EUrun;
import org.enes.lesson21.repository.KullaniciRepository;
import org.enes.lesson21.service.KullaniciServis;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class KullaniciKontrol {
    /**
     * 1- kullan�c� s�n�f�m�z olacak kullan�c�lar�m�z username ve password ile uygulamaya giri� yapacaklar
     * daha sonra sepetlerine �r�n ekleyecekler
     * 2- Kullan�c�lar�m�z� database ad�nda bir s�n�fta tutal�m uygulama ba�larken default 3 tane kullan�c�m�z olsun
     * uygulama i�inde kay�t ol se�ene�i ile beraber database e kullan�c� ekleyelim. Giri� yap metodu ilede beraber
     * kullan�c� kontrol�nden sonra b�yle bir kullan�c� varsa kullan�c� men�s� a��ls�n.
     * uygulama men�s� ==> kay�t ol - giri� yap- kullan�c�lar� g�ster.
     * 3- Sepet==> sepetimize kullan�c�n�n ekledi�i �r�nlerin tutuldu�u ve genel bilgilerin g�sterildi�i yer
     * 4- �r�nlerimiz sabit olsun uygulama boyunca �r�n ekleyip ��karmayal�m.
     * Cip,Kola,�eker,Ya�,Un,Ekmek,Cay,Yumurta,Yo�urt,S�t
     * 5- Kullan�c� men�s�nde ==> Sepeti g�ster.
     *                            �r�n ekle
     *                            ��k��
     *
     * 6- sepeti g�ster metodu => e�er sepet bo�sa sepetiniz bo� yazs�n de�ilse listelesin
     * 7- �r�n ekle �nce �r�n listemizi g�rece�iz daha sonra bir �r�n se�ip sepete ekleyece�iz.
     *
     * �dev==>
     * her urunun bir fiyat� olsa ve sepeti goster metodu cal�st��� zaman urun listelemeyle beraber
     * sepetteki urunlerin toplam�n� bana yazd�rsa
     */

    private KullaniciServis kullaniciServis;

    Scanner scanner=new Scanner(System.in);
    private Kullanici aktifKullanici;

    public KullaniciKontrol(){
        this.kullaniciServis=new KullaniciServis();
    }

    public void uygulamayiBaslat(){
        kullaniciServis.defaultKullanici();

        while (true){
            uygulamaMenu();
            int secim=scanner.nextInt();
            scanner.nextLine();

            switch (secim){
                case 1: kayitOl(); break;
                case 2: girisYap(); break;
                case 3:kullanicilariGoster(); break;
                case 4: System.exit(0); break;
            }
        }
    }

    public void uygulamaMenu(){
        System.out.println("***********- Uygulama Men�s� -***********");
        System.out.println("1- KAYIT OL");
        System.out.println("2- G�R�� YAP");
        System.out.println("3- KULLANICILARI G�STER");
        System.out.println("4- ��k��");
        System.out.println("��leminizi se�iniz...");

    }

    public void kullaniciMenusu(){
        System.out.println("***********- Kullan�c� Men�s� -***********");
        System.out.println("1- Sepeti g�ster");
        System.out.println("2- �r�n ekle");
        System.out.println("3- ��k��");
        System.out.println("��leminizi se�iniz...");
    }

    public void kullaniciMenusuBaslat(){

        int secim;
        do {
            kullaniciMenusu();
            secim= scanner.nextInt();
            switch (secim){
                case 1: sepetiGoster();
                    break;
                case 2:urunEkle();
                    break;
                case 3:
                    System.out.println("�st men�ye d�n�l�yor...");
                    break;
            }
        }while (secim!=3);
    }

//    public void kullaniciMenusuBaslat2(Kullanici kullanici){
//        kullaniciMenusu();
//        int secim= scanner.nextInt();
//        do {
//            switch (secim){
//                case 1: sepetiGoster2(kullanici);
//                    break;
//                case 2:
//                    break;
//                case 3:
//                    System.out.println("�st men�ye d�n�l�yor...");
//                    break;
//            }
//        }while (secim!=3);
//    }

    public void kayitOl() {
        System.out.println("Kay�t i�in ad�n�z� giriniz...");
        String ad = scanner.nextLine();

        System.out.println("Kay�t i�in kullan�c� ad� giriniz...");
        String username=kullaniAdiKontrol();

        System.out.println("Kay�t i�in �ifrenizi giriniz...");
        String password = scanner.nextLine();

        Kullanici kullanici = new Kullanici(ad, username, password);
        kullaniciServis.kayitEt(kullanici);
        System.out.println(kullanici.getAd() + " database'e ba�ar�yla eklendi.");
    }

    public void girisYap(){
        System.out.println("Kullan�c� ad�n�z� giriniz...");
        String kullaniciAdi=scanner.nextLine();

        System.out.println("�ifrenizi giriniz...");
        String sifre=scanner.nextLine();

        Kullanici kullanici=kullaniciServis.kullaniciAdiveSifreIleKullaniciGetir(kullaniciAdi,sifre);
        if (kullanici!=null){
            aktifKullanici=kullanici;
            kullaniciMenusuBaslat();
//            kullaniciMenusuBaslat2(kullanici);
        }
    }

    public String kullaniAdiKontrol(){
        Kullanici kullanici=null;
        String username=null;
        do {
            username=scanner.nextLine();
            kullanici=kullaniciServis.kullaniciAdiIleKullaniciGetir(username);

        }while (kullanici!=null);
        return username;
    }

    public void kullanicilariGoster(){
        List<Kullanici> kullanicilar= kullaniciServis.kullanicilariGetir();
        for (Kullanici kullanici:kullanicilar){
            System.out.println(kullanici);
        }
    }

    public void sepetiGoster(){
//        aktifKullanici.setSepet(new Sepet()); veya kullan�c� constructor�nda newleme yap�labilirdi.

        if (aktifKullanici.getSepet().getUrunler().isEmpty()){
            System.out.println("Sepetiniz bo�");
        }else {
            for (EUrun urun:aktifKullanici.getSepet().getUrunler()){
                System.out.println(urun);
            }
        }
    }

//    public void sepetiGoster2(Kullanici kullanici){
//        if (kullanici.getSepet().getUrunler().isEmpty()){
//            System.out.println("Sepetiniz bo�");
//        }else {
//            for (EUrun urun:kullanici.getSepet().getUrunler()){
//                System.out.println(urun);
//            }
//        }
//    }

    public void urunListesi(){
        EUrun [] urunler=EUrun.values();

        for (EUrun urun:urunler){
            System.out.println((urun.ordinal()+1)+". �r�n "+urun);

        }
        System.out.println("��k�� i�in 0 a bas�n.");
    }

    public void urunEkle(){

        urunListesi();
        int secim;
        while((secim=scanner.nextInt())!=0){
            urunListesi();
            EUrun urun=EUrun.values()[secim-1];
            aktifKullanici.getSepet().getUrunler().add(urun);
            System.out.println(urun+" ba�ar� ile eklendi.");
        }


    }
}
