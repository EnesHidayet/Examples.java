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
     * 1- kullanýcý sýnýfýmýz olacak kullanýcýlarýmýz username ve password ile uygulamaya giriþ yapacaklar
     * daha sonra sepetlerine ürün ekleyecekler
     * 2- Kullanýcýlarýmýzý database adýnda bir sýnýfta tutalým uygulama baþlarken default 3 tane kullanýcýmýz olsun
     * uygulama içinde kayýt ol seçeneði ile beraber database e kullanýcý ekleyelim. Giriþ yap metodu ilede beraber
     * kullanýcý kontrolünden sonra böyle bir kullanýcý varsa kullanýcý menüsü açýlsýn.
     * uygulama menüsü ==> kayýt ol - giriþ yap- kullanýcýlarý göster.
     * 3- Sepet==> sepetimize kullanýcýnýn eklediði ürünlerin tutulduðu ve genel bilgilerin gösterildiði yer
     * 4- Ürünlerimiz sabit olsun uygulama boyunca ürün ekleyip çýkarmayalým.
     * Cip,Kola,Þeker,Yað,Un,Ekmek,Cay,Yumurta,Yoðurt,Süt
     * 5- Kullanýcý menüsünde ==> Sepeti göster.
     *                            ürün ekle
     *                            Çýkýþ
     *
     * 6- sepeti göster metodu => eðer sepet boþsa sepetiniz boþ yazsýn deðilse listelesin
     * 7- ürün ekle önce ürün listemizi göreceðiz daha sonra bir ürün seçip sepete ekleyeceðiz.
     *
     * ödev==>
     * her urunun bir fiyatý olsa ve sepeti goster metodu calýstýðý zaman urun listelemeyle beraber
     * sepetteki urunlerin toplamýný bana yazdýrsa
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
        System.out.println("***********- Uygulama Menüsü -***********");
        System.out.println("1- KAYIT OL");
        System.out.println("2- GÝRÝÞ YAP");
        System.out.println("3- KULLANICILARI GÖSTER");
        System.out.println("4- Çýkýþ");
        System.out.println("Ýþleminizi seçiniz...");

    }

    public void kullaniciMenusu(){
        System.out.println("***********- Kullanýcý Menüsü -***********");
        System.out.println("1- Sepeti göster");
        System.out.println("2- Ürün ekle");
        System.out.println("3- Çýkýþ");
        System.out.println("Ýþleminizi seçiniz...");
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
                    System.out.println("Üst menüye dönülüyor...");
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
//                    System.out.println("Üst menüye dönülüyor...");
//                    break;
//            }
//        }while (secim!=3);
//    }

    public void kayitOl() {
        System.out.println("Kayýt için adýnýzý giriniz...");
        String ad = scanner.nextLine();

        System.out.println("Kayýt için kullanýcý adý giriniz...");
        String username=kullaniAdiKontrol();

        System.out.println("Kayýt için þifrenizi giriniz...");
        String password = scanner.nextLine();

        Kullanici kullanici = new Kullanici(ad, username, password);
        kullaniciServis.kayitEt(kullanici);
        System.out.println(kullanici.getAd() + " database'e baþarýyla eklendi.");
    }

    public void girisYap(){
        System.out.println("Kullanýcý adýnýzý giriniz...");
        String kullaniciAdi=scanner.nextLine();

        System.out.println("Þifrenizi giriniz...");
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
//        aktifKullanici.setSepet(new Sepet()); veya kullanýcý constructorýnda newleme yapýlabilirdi.

        if (aktifKullanici.getSepet().getUrunler().isEmpty()){
            System.out.println("Sepetiniz boþ");
        }else {
            for (EUrun urun:aktifKullanici.getSepet().getUrunler()){
                System.out.println(urun);
            }
        }
    }

//    public void sepetiGoster2(Kullanici kullanici){
//        if (kullanici.getSepet().getUrunler().isEmpty()){
//            System.out.println("Sepetiniz boþ");
//        }else {
//            for (EUrun urun:kullanici.getSepet().getUrunler()){
//                System.out.println(urun);
//            }
//        }
//    }

    public void urunListesi(){
        EUrun [] urunler=EUrun.values();

        for (EUrun urun:urunler){
            System.out.println((urun.ordinal()+1)+". ürün "+urun);

        }
        System.out.println("Çýkýþ için 0 a basýn.");
    }

    public void urunEkle(){

        urunListesi();
        int secim;
        while((secim=scanner.nextInt())!=0){
            urunListesi();
            EUrun urun=EUrun.values()[secim-1];
            aktifKullanici.getSepet().getUrunler().add(urun);
            System.out.println(urun+" baþarý ile eklendi.");
        }


    }
}
