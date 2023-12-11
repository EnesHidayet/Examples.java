package org.enes.lesson32;

import java.util.Locale;
import java.util.Optional;

/**
 * 1- Bir liman�n�z olacak bu limanda y�k yerle�tirilecek alanlar olacak limanda y�k yerle�tirilecek alanlar liman olu�tururken belirlenebilir veya standart her liman i�in
 * 10 adet y�k yeri olabilir.Her y�k�n bir a��rl��� kabul tarihi olacak (String)
 *
 * 2-Kendi exception enumumuzu yazal�m.
 * metot yazal�m yukYeriSec metodu olacak --> bu metot d��ar�dan bir y�k yeri se�imi alacak ve bu y�k yeri dolu ise y�k yeri dolu diye bir hata f�rlatacak.
 * bu metodu �al��t�rmadan �nce default olarak 2 yuk yerini elle doldural�m. daha sonra �al��t�ral�m.
 *
 * yukyersec2--> yuk yeri se�imi yapacak ve se�ti�i y�k yerinin int de�erini bize d�necek
 * yerle�tirme i�lemini bu metod yapmayacakt�r.!!!!! y�k yeri dolu ise hata f�rlats�n ayr�ca s�n�rlar�n d���nda bir de�er girilmi� ise
 * ba�ka bir hata f�rlats�n
 *
 * 3- A��rl�kBelirle --> liman�m�z 250 kg nin alt�n� kabul etmiyor. kullan�c�dan bir a��rl�k de�eri alal�m e�er 250 kg nin alt�ndaysa yetersiz a��rl�k
 * oldu�unu belirten bir hata f�rlatal�m.
 *
 * �DEV tarihBelileMetodu-->
 * 4-a) girilen tarih bug�nden �ncemi �nce ise bir hata f�rlataca��z
 * b) Cumartesi ve pazar mesai saatleri d���ndad�r e�er
 *
 * 5- Yuk olu�tur metodu bize optional y�k d�necek
 * tarhi belirle a��rl�k belirle metotlar� kullan�lacak.
 * once y�k yeri sonra a��rl�k sonra tarih e�er bunlarda hata yoksa y�k olu�turulup geri d�n�lecek hata varsa bo� optional d�n�lecek
 */

public class Uygulama {
    private Liman liman;
    private final long GUN=24*60*60*1000;
    public Uygulama() {
        this.liman = new Liman();
        this.liman.getYukler()[0]=new Yuk("Hurda",11750,new MyDate(System.currentTimeMillis()-GUN,EGun.CARSAMBA));
        this.liman.getYukler()[1]=new Yuk("Bu�day",55000,new MyDate(System.currentTimeMillis()-2*GUN,EGun.SALI));
    }

//    public MyDate tarihBelirleMetodu(MyDate date){
//
//        if (date.getKabulGunu()==EGun.CUMARTESI || date.getKabulGunu()==EGun.PAZAR) {
//            throw new LimanException(ErrorType.MESAI_DISI_GUN_HATASI);
//        }else if (date.getKabulTarihi()!=System.currentTimeMillis() || date.getKabulGunu()!=EGun.CUMA){
//            throw new LimanException(ErrorType.TARIH_BUGUN_DEGIL_HATASI);
//        }
//
//        System.out.println("Zaman uygun.");
//        return date;
//    }

    public Optional<Yuk> yukOlustur(){
        Yuk yuk = null;
        try {
             yuk=new Yuk(Utility.stringDegerAl("Y�k�n ismini giriniz."), agirlikBelirle(), tarihBelirleMetodu2());
        }catch (Exception e){
            System.out.println("Hata...:"+e.toString());
        }
        return Optional.ofNullable(yuk);
    }

    public MyDate tarihBelirleMetodu2(){
        long bugun=System.currentTimeMillis();
        int gunSayisi=Utility.intDegerAl("L�tfen tarih giriniz + veya - kullanarak kac gun �nce veeya sonra i�lem yapmak istedi�inizi griniz.");
//        String stringGun=Utility.stringDegerAl("L�tfen g�n degerini giriniz.").toUpperCase(Locale.ENGLISH);
//        EGun gun=EGun.valueOf(stringGun);
        long tarih=bugun+(gunSayisi*GUN);
        EGun gun=gunBelirle();
        if (tarih<bugun){
            throw new LimanException(ErrorType.GECERSIZ_KABUL_TARIHI);
        }
        if (gun.equals(EGun.CUMARTESI) || gun.equals(EGun.PAZAR)){
            throw new LimanException(ErrorType.MESAI_DISI_GUN_HATASI);
        }
        return new MyDate(tarih,gun);
    }

    public EGun gunBelirle(){
        boolean kontrol=false;
        EGun gun = null;
        do {
            String stringGun=Utility.stringDegerAl("L�tfen g�n degerini giriniz.").toUpperCase(Locale.ENGLISH);
            try {
                gun=EGun.valueOf(stringGun);
                kontrol=false;
            }catch (IllegalArgumentException e){
                System.out.println("Hata olu�tu."+e.toString());
                kontrol=true;
            }

        }while (kontrol);
        return gun;
    }

    public void yukYeriSec(Yuk yuk){
        System.out.println("Bo� Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alan� secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("L�tfen bir yuk alan� seciniz");
        index=index-1;
        if (liman.getYukler()[index]==null){
            liman.getYukler()[index]=yuk;
            System.out.println("��lem ba�ar�l�");
        }else{
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public int yukYeriSec2(Yuk yuk){
        System.out.println("Bo� Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alan� secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("L�tfen bir yuk alan� seciniz");
        index=index-1;
        if (index<0 || index>liman.getAlanSayisi()){
            throw new LimanException(ErrorType.YUK_YERI_SINIR_HATASI);
        }
        if (liman.getYukler()[index]==null){
            return index;
        }else{
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public int yukYeriSec3(){
        boolean kontrol=false;
        int index=-1;
        do {

            index=Utility.intDegerAl("L�tfen bir yuk alan� seciniz");
            try {
                kontrol=indexKontrol(index);
            }catch (LimanException e){
                System.out.println(kontrol);
                System.out.println(e.toString());
            }


        }while (!kontrol);

        return index;
    }

    public boolean indexKontrol(int index){
        if (index>liman.getAlanSayisi() || index<0){
            throw new LimanException(ErrorType.YUK_YERI_SINIR_HATASI);
        }
        if (liman.getYukler()[index]!=null){
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
        return true;
    }

    public double agirlikBelirle(){
        double agirlik=Utility.doubleDegerAl("Y�k�n a��rl���n� giriniz.");
        if (agirlik<250){
            throw new LimanException(ErrorType.DUSUK_AGIRLIK_HATASI);
        }
        return agirlik;
    }

    /**
     * 6- Yuk kabul metodu
     * �nce bir y�k yeri se�imi yap�caz y�kyerisec3 ile
     * daha sonra bir yuk olu�turaca��z y�kolustur ile
     * e�er bu y�k var ise y�k�m�z kabbul olmu�tur e�er bu y�k yok ise y�k�n�z kabul olmam��t�r ��kt�s� verelim.
     */

    public void yukKabul(){
        int index=-1;
        try {
            index=yukYeriSec3();
        }catch (LimanException e){
            System.out.println("Hata olu�tu...:"+e.toString());
        }
        Optional<Yuk> yeniYuk=yukOlustur();
        if (yeniYuk.isEmpty()){
            System.out.println("Y�k�n�z kabul olmam��t�r");
        }else {
            System.out.println("Y�k�n�z kabul olmu�tur.-->"+yeniYuk.get().getIsim());
            liman.getYukler()[index]=yeniYuk.get();
        }
    }



    public static void main(String[] args) {
        Uygulama uygulama=new Uygulama();
//        int secim=uygulama.yukYeriSec3(new Yuk("Yuk3",uygulama.agirlikBelirle(),uygulama.tarihBelirleMetodu(new MyDate(System.currentTimeMillis(),EGun.CUMA))));
        Liman liman1=new Liman();
//        liman1.getYukler()[3]=new Yuk("Yuk3",uygulama.agirlikBelirle(),uygulama.tarihBelirleMetodu2());
//        System.out.println(secim);
//        Optional<Yuk> yuk=uygulama.yukOlustur();
//        System.out.println(yuk);
        uygulama.yukKabul();
        uygulama.yukKabul();
        uygulama.yukKabul();


    }
}

