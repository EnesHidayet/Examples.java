package org.enes.lesson32;

import java.util.Locale;
import java.util.Optional;

/**
 * 1- Bir limanýnýz olacak bu limanda yük yerleþtirilecek alanlar olacak limanda yük yerleþtirilecek alanlar liman oluþtururken belirlenebilir veya standart her liman için
 * 10 adet yük yeri olabilir.Her yükün bir aðýrlýðý kabul tarihi olacak (String)
 *
 * 2-Kendi exception enumumuzu yazalým.
 * metot yazalým yukYeriSec metodu olacak --> bu metot dýþarýdan bir yük yeri seçimi alacak ve bu yük yeri dolu ise yük yeri dolu diye bir hata fýrlatacak.
 * bu metodu çalýþtýrmadan önce default olarak 2 yuk yerini elle dolduralým. daha sonra çalýþtýralým.
 *
 * yukyersec2--> yuk yeri seçimi yapacak ve seçtiði yük yerinin int deðerini bize dönecek
 * yerleþtirme iþlemini bu metod yapmayacaktýr.!!!!! yük yeri dolu ise hata fýrlatsýn ayrýca sýnýrlarýn dýþýnda bir deðer girilmiþ ise
 * baþka bir hata fýrlatsýn
 *
 * 3- AðýrlýkBelirle --> limanýmýz 250 kg nin altýný kabul etmiyor. kullanýcýdan bir aðýrlýk deðeri alalým eðer 250 kg nin altýndaysa yetersiz aðýrlýk
 * olduðunu belirten bir hata fýrlatalým.
 *
 * ÖDEV tarihBelileMetodu-->
 * 4-a) girilen tarih bugünden öncemi önce ise bir hata fýrlatacaðýz
 * b) Cumartesi ve pazar mesai saatleri dýþýndadýr eðer
 *
 * 5- Yuk oluþtur metodu bize optional yük dönecek
 * tarhi belirle aðýrlýk belirle metotlarý kullanýlacak.
 * once yük yeri sonra aðýrlýk sonra tarih eðer bunlarda hata yoksa yük oluþturulup geri dönülecek hata varsa boþ optional dönülecek
 */

public class Uygulama {
    private Liman liman;
    private final long GUN=24*60*60*1000;
    public Uygulama() {
        this.liman = new Liman();
        this.liman.getYukler()[0]=new Yuk("Hurda",11750,new MyDate(System.currentTimeMillis()-GUN,EGun.CARSAMBA));
        this.liman.getYukler()[1]=new Yuk("Buðday",55000,new MyDate(System.currentTimeMillis()-2*GUN,EGun.SALI));
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
             yuk=new Yuk(Utility.stringDegerAl("Yükün ismini giriniz."), agirlikBelirle(), tarihBelirleMetodu2());
        }catch (Exception e){
            System.out.println("Hata...:"+e.toString());
        }
        return Optional.ofNullable(yuk);
    }

    public MyDate tarihBelirleMetodu2(){
        long bugun=System.currentTimeMillis();
        int gunSayisi=Utility.intDegerAl("Lütfen tarih giriniz + veya - kullanarak kac gun önce veeya sonra iþlem yapmak istediðinizi griniz.");
//        String stringGun=Utility.stringDegerAl("Lütfen gün degerini giriniz.").toUpperCase(Locale.ENGLISH);
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
            String stringGun=Utility.stringDegerAl("Lütfen gün degerini giriniz.").toUpperCase(Locale.ENGLISH);
            try {
                gun=EGun.valueOf(stringGun);
                kontrol=false;
            }catch (IllegalArgumentException e){
                System.out.println("Hata oluþtu."+e.toString());
                kontrol=true;
            }

        }while (kontrol);
        return gun;
    }

    public void yukYeriSec(Yuk yuk){
        System.out.println("Boþ Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alaný secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("Lütfen bir yuk alaný seciniz");
        index=index-1;
        if (liman.getYukler()[index]==null){
            liman.getYukler()[index]=yuk;
            System.out.println("Ýþlem baþarýlý");
        }else{
            throw new LimanException(ErrorType.DOLU_YER_SECIMI);
        }
    }

    public int yukYeriSec2(Yuk yuk){
        System.out.println("Boþ Yerler");
        for (int i = 0; i <liman.getYukler().length ; i++) {
            if (liman.getYukler()[i]==null){
                System.out.println((i+1)+" alaný secebilirsiniz");
            }
        }
        int index=Utility.intDegerAl("Lütfen bir yuk alaný seciniz");
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

            index=Utility.intDegerAl("Lütfen bir yuk alaný seciniz");
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
        double agirlik=Utility.doubleDegerAl("Yükün aðýrlýðýný giriniz.");
        if (agirlik<250){
            throw new LimanException(ErrorType.DUSUK_AGIRLIK_HATASI);
        }
        return agirlik;
    }

    /**
     * 6- Yuk kabul metodu
     * önce bir yük yeri seçimi yapýcaz yükyerisec3 ile
     * daha sonra bir yuk oluþturacaðýz yükolustur ile
     * eðer bu yük var ise yükümüz kabbul olmuþtur eðer bu yük yok ise yükünüz kabul olmamýþtýr çýktýsý verelim.
     */

    public void yukKabul(){
        int index=-1;
        try {
            index=yukYeriSec3();
        }catch (LimanException e){
            System.out.println("Hata oluþtu...:"+e.toString());
        }
        Optional<Yuk> yeniYuk=yukOlustur();
        if (yeniYuk.isEmpty()){
            System.out.println("Yükünüz kabul olmamýþtýr");
        }else {
            System.out.println("Yükünüz kabul olmuþtur.-->"+yeniYuk.get().getIsim());
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

